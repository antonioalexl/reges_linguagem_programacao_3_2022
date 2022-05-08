/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.respostaexercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author User
 */
public class Exercicio02 {

    private static final int TAMANHO_TXT = 10;

    /*
    Crie um formulário com 3 JTextfields e 3 JLabels (Nome, Razão Social e
Documento). Crie também um combobox com os itens (Física ou Jurídica) e
mude o texto do label do documento de acordo com o que foi escolhido. Crie
um botão, assine um evento de clique e exiba um dialog com o que for
digitado nos campos de textos
    
     */
    public void criarFormulario() {

        JFrame frm = new JFrame();
        frm.setTitle("Fomulário de Cadastro");

        frm.setLayout(new BorderLayout());

        frm.getContentPane().add(getConteudoInterno(), BorderLayout.CENTER);

        frm.getContentPane().add(getRodape(), BorderLayout.SOUTH);

        frm.pack();
        frm.setVisible(true);

    }

    private JPanel getConteudoInterno() {

        JPanel painelCentral = new JPanel();

        JLabel lblNome = new JLabel("Nome");
        JTextField txtNome = new JTextField(TAMANHO_TXT);

        JLabel lblRazao = new JLabel("Razão");
        JTextField txtRazaoSocial = new JTextField(TAMANHO_TXT);

        JLabel lblDocumento = new JLabel("Cpf");
        JTextField txtDocumento = new JTextField(TAMANHO_TXT);

        JLabel lblTipo = new JLabel("Tipo");
        JComboBox combo = new JComboBox();
        combo.addItem("Física");
        combo.addItem("Jurídica");

        combo.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
             
                if (combo.getSelectedItem() == "Física") {
                    lblDocumento.setText("Cpf");
                }
                else
                {
                  lblDocumento.setText("Cnpj");
                }
            }
        });

        
        painelCentral.setLayout(new GridLayout(4, 2, 10, 10));

        //LINHA 1
        painelCentral.add(lblNome);
        painelCentral.add(txtNome);

        //LINHA 2
        painelCentral.add(lblRazao);
        painelCentral.add(txtRazaoSocial);

        //LINHA 3
        painelCentral.add(lblTipo);
        painelCentral.add(combo);

        //LINHA 4
        painelCentral.add(lblDocumento);
        painelCentral.add(txtDocumento);

        return painelCentral;
    }

    private JPanel getRodape() {
        JPanel painelRodape = new JPanel();

        JButton btn = new JButton("Clique Aqui!!!");

         btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Teste");
            }
        }
        );

        
        
        painelRodape.add(btn);
        
        return painelRodape;

    }
}
