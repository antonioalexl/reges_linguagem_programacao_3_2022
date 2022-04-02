/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.respostaexercicios;

/**
 *
 * @author alex.lopes
 */
public class Exercicios {

    /*
    Desenvolva um algoritmo que imprima a tabuada somente dos números pares de 1 ao 10.
     */
    public void exercicio01() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {

                
                System.out.println(" TABUADA DO: " + i  );
                for (int j = 0; j < 10; j++) {
                    System.out.println(i  + "x " + j + " = " + (i * j) )  ;
                }
            }
        }

    }
}
