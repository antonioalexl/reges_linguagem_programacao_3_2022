/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author alex.lopes
 */
public class Calculadora {

    public void calculadora() {

        //BOTOES
        JPanel pnBotoes = new JPanel();
        pnBotoes.setLayout(new GridLayout(4, 4,5,5));
        //LINHA 1
        pnBotoes.add(new JButton("7"));
        pnBotoes.add(new JButton("8"));
        pnBotoes.add(new JButton("9"));
        pnBotoes.add(new JButton("/"));

        //LINHA 2
        pnBotoes.add(new JButton("4"));
        pnBotoes.add(new JButton("5"));
        pnBotoes.add(new JButton("6"));
        pnBotoes.add(new JButton("x"));
        
        
        //LINHA 3
        pnBotoes.add(new JButton("1"));
        pnBotoes.add(new JButton("2"));
        pnBotoes.add(new JButton("3"));
        pnBotoes.add(new JButton("-"));
        
        
         //LINHA 4
        pnBotoes.add(new JButton("0"));
        pnBotoes.add(new JButton("."));
        pnBotoes.add(new JButton("="));
        pnBotoes.add(new JButton("+"));
        

        JFrame frame = new JFrame();
        frame.setTitle("Calculadora");
        
        JTextField campDigitacao = new JTextField();
        campDigitacao.setFont(new Font("serif", Font.PLAIN, 24));
        campDigitacao.setHorizontalAlignment(SwingConstants.RIGHT);
        
        
        Container c = frame.getContentPane();
        c.add(BorderLayout.NORTH, campDigitacao);
        c.add(BorderLayout.CENTER, pnBotoes);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);

        frame.setResizable(false);
        frame.setVisible(true);

    }
}
