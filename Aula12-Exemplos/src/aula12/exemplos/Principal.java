/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.exemplos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    public static void main(String[] args) {

        JButton botoes[];
        botoes = new JButton[20];

        JFrame f = new JFrame();
        f.setSize(600, 400);

        f.setLocationRelativeTo(null);
        f.setTitle("Testando Layout");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        for (int i = 0; i <= 12; i++) {

            botoes[i] = new JButton("Botão " + i);
            f.add(botoes[i]);
        }

        //Flow Layout        
        // f.setLayout(new FlowLayout(2,10,10));             
        //Alinhamento 0 = Esquerda, 1 = Centralizado, 2 = Direita
        //FlowLayout(Alinhamento, Espaco H, Espaco V )
        //Distância em pixels
        //Espaço H (Alinhamento Horizontal, espaço em que os componentes vão ficar na horizontal
        //Espaço V (Alinhamento Vertical, distância em que os componentes vão ficar na vertical
        
        
        //Grid Layout
        //f.setLayout(new GridLayout(4,3,100,10));    
        //GridLayout(Nº Linhas, Nº Colunas,  Espaco H, Espaco V )
        //f.setLayout(new BorderLayout(0,100,100));        
        //FlowLayout(Alinhamento, Espaco H, Espaco V )
        
        
        //Border Layout
        //Posiciona os componentes em 6 regiões
       // f.setLayout(new BorderLayout(10,10));
        
       // f.add("North", botoes[0]);
        //f.add("South", botoes[1]);
       // f.add("West", botoes[2]);
       // f.add("East", botoes[3]);
       // f.add("Center", botoes[4]);
        
        
        
        //Quando informe o layout nulo, 
        //para os componentes aparecerem, obrigatoriamente deve colocar o tamanho e a posição do componente
        f.setLayout(null);
        //botoes[0].setBounds(10,20,200,40);
        //botoes[1].setBounds(10,80,200,40);
        //botoes[2].setBounds(10,140,200,40);
        
        //setBounds(Left, Top, Width, Height);  
        for (int i = 0; i < 10; i++) {
            
            //Vertical
            // botoes[i].setBounds(10,i * 50,120,40);
             
             //Horizontal
           // botoes[i].setBounds(i * 130,10,120,40);
            
            
           //Escada
           botoes[i].setBounds(i * 130,i * 50,120,40);
        }
        
        f.setVisible(true);
    }

}
