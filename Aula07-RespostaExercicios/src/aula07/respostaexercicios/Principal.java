/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exercicios exercicios = new Exercicios();
        exercicios.exercicio01();
        
        System.out.println("---------------");
        
        TV tv = new TV();
        for (int i = 0; i < 80; i++) {
            tv.aumentarCanal();
        }
          System.out.println("---------------");
        for (int i = 0; i < 100; i++) {
            tv.baixarCanal();
        }
          System.out.println("---------------");
        
        for (int i = 0; i < 80; i++) {
            tv.aumentarVolume();
        }
       
         System.out.println("---------------");
        for (int i = 0; i < 100; i++) {
            tv.baixarVolume();
        }
        
        
    }
    
    
    //Exercicio01
    
    
}
