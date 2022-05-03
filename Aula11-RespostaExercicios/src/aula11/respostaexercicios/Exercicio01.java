/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.respostaexercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Exercicio01 {

    public void gerarForms() {

        JFrame frame = new JFrame();

        frame.setTitle("Abrindo forms");
        frame.setSize(600, 400);

        JButton btnAmarelo = new JButton("Amarelo");
        JButton btnAzul = new JButton("Azul");
        JButton btnVermelho = new JButton("Vermelho");
        JButton btnFechar = new JButton("Fechar");

        frame.add(btnAzul);
        frame.add(btnVermelho);
        frame.add(btnAmarelo);
        frame.add(btnFechar);

        btnAmarelo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getFormCores(1);
            }
        }
        );

        btnVermelho.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getFormCores(2);
            }
        }
        );

        btnAzul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getFormCores(3);
            }
        }
        );

        btnFechar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );

        frame.setLayout(new FlowLayout());

        frame.setVisible(true);

    }

    private void getFormCores(int cor) {
        JFrame frm = new JFrame();
        JPanel panel = new JPanel();

        switch (cor) {
            case 1:
                frm.setTitle("Amarelo");
                panel.setBackground(Color.yellow);
                break;

            case 2:
                frm.setTitle("Vermelho");
                panel.setBackground(Color.red);
                break;

            case 3:
                frm.setTitle("Azul");
                panel.setBackground(Color.blue);
                break;
        }

        frm.getContentPane().add(panel);
        frm.setSize(500, 500);
        frm.setVisible(true);

    }
}
