/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.calculadora;

import javax.swing.SwingUtilities;

/**
 *
 * @author alex.lopes
 */
public class Principal {
    
      public static void main(String[] args) {
        // TODO code application logic here
        //Calculadora calc = new Calculadora();
        //calc.calculadora();
        
        
        //Chama em uma tread e não trava a aplicação
        SwingUtilities.invokeLater(()->{
            Calculadora2 calc2 = new Calculadora2();
            calc2.setVisible(true);
        
        });
        
    }
}
