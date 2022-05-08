/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.calculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alex.lopes
 */
public abstract class CalculadoraForm extends JFrame {
    
    private static final int TAMANHO_TXT = 15;
    
    protected JPanel pnlForm;
    protected JPanel pnlRodape;

    protected JButton btnCalcular;
    protected JButton btnLimpar;
    protected JButton btnFechar;

    //Capital
    protected JLabel lblCapital;
    protected JTextField txtCapital;
    //Taxa Juros    
    protected JLabel lblTaxaJuros;
    protected JTextField txtTaxaJuros;
    //Periodo
    protected JLabel lblPeriodo;
    protected JTextField txtPeriodo;
    //Montante
    protected JLabel lblMontante;
    protected JTextField txtMontante;

    public CalculadoraForm() {
        this.inicializar();
        this.eventos();
    }
    protected abstract void btnFecharClick(ActionEvent ev);
    protected abstract void btnLimparClick(ActionEvent ev);
    protected abstract void btnCalcularClick(ActionEvent ev);
    
    private void eventos(){
    
        btnFechar.addActionListener(this::btnFecharClick);
        btnLimpar.addActionListener(this::btnLimparClick);
        btnCalcular.addActionListener(this::btnCalcularClick);
        
    }

    private void inicializar() {
        this.setTitle(("Calculadora Juros Compostos"));
       // this.setSize(640, 480);
       
      
          
        this.getContentPane().setLayout(new BorderLayout());
        //fecha e distrói
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //FORMULÁRIO
        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);

        //RODAPÉ
        this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
        
            this.pack();

    }

    public JPanel getPnlRodape() {
        if (pnlRodape == null) {

            pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnCalcular = new JButton("Calcular");
            btnLimpar = new JButton("Limpar");
            btnFechar = new JButton("Fechar");

            pnlRodape.add(btnCalcular);
            pnlRodape.add(btnLimpar);
            pnlRodape.add(btnFechar);
        }
        return pnlRodape;
    }

    public JPanel getPnlForm() {
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(4, 2));

            lblCapital = new JLabel("Capital");
            txtCapital = new JTextField(TAMANHO_TXT);

            lblTaxaJuros = new JLabel("Taxa Juros");
            txtTaxaJuros = new JTextField(TAMANHO_TXT);

            lblPeriodo = new JLabel("Período");
            txtPeriodo = new JTextField(TAMANHO_TXT);

            lblMontante = new JLabel("Montante");
            txtMontante = new JTextField(TAMANHO_TXT);
            txtMontante.setEditable(false);

            //LINHA 1
            pnlForm.add(lblCapital);
            pnlForm.add(txtCapital);

            //LINHA 2
            pnlForm.add(lblPeriodo);
            pnlForm.add(txtPeriodo);

            //LINHA 3
            pnlForm.add(lblTaxaJuros);
            pnlForm.add(txtTaxaJuros);

            //LINHA 4
            pnlForm.add(lblMontante);
            pnlForm.add(txtMontante);

        }
        return pnlForm;
    }
}
