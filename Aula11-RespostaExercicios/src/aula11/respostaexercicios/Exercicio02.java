/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.respostaexercicios;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Exercicio02 {

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

        JTextField txtNome = new JTextField();
        txtNome.setSize(100, 40);
        JTextField txtRazaoSocial = new JTextField();
        JTextField txtDocumento = new JTextField();

        JLabel lblNome = new JLabel("Nome");
        JLabel lblRazao = new JLabel("Razão");
        JLabel lblTipo = new JLabel("Tipo");
        JLabel lblDocumento = new JLabel("Documento");

        JComboBox combo = new JComboBox();
        combo.addItem("Física");
        combo.addItem("Jurídica");

        //frm.setLayout(new GridLayout(4, 2, 10,10));
        
        frm.setLayout(new FlowLayout());

        frm.add(lblNome);
        frm.add(txtNome);

        frm.add(lblRazao);
        frm.add(txtRazaoSocial);
        
        frm.add(lblTipo);
        frm.add(combo);
        
        frm.add(lblDocumento);
        frm.add(txtDocumento);

        frm.setSize(700, 500);
        frm.pack();
        frm.setVisible(true);

    }
}
