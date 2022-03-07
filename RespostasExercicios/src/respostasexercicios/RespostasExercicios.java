/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostasexercicios;

import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class RespostasExercicios {

    /*Exercício 1:
    Faça um algoritmo para calcular e exibir a média ponderada de 2 notas. As notas devem ser solicitadas ao usuário. O peso para cálculo deve ser o seguinte:    60% para primeira nota
    40% para os trabalhos (segunda nota)*/
 /* public static void main(String[] args) {

        double p1 = 0.6;
        double p2 = 0.4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double x2 = scanner.nextDouble();

        
        //ATENCÃO AS PARARENTESES E ORDEM DE EXECUÇÃO.
        double media = ((p1 * x1) + (p2 * x2)) / (p1 + p2);        
        //double media = p1 * x1 + p2 * x2 / (p1 + p2);
        System.out.println("A media é: " + media);

    }*/
 /*
    Exercício 02:
    Faça um algoritmo que recebe como entrada do usuário o preço da gasolina e do etanol, 
    faça o cálculo e retorne se é mais vantajoso abastecer com etanol ou gasolina. Para a regra de cálculo, 
    considere que é mais vantajoso abastecer com etanol quando o preço do litro for menor que 70% do valor da gasolina.
     */
 /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço da gasolina: ");
        double pGasolina = scanner.nextDouble();

        System.out.print("Preço do etanol: ");
        double pEtanol = scanner.nextDouble();

        double calculo = (pEtanol / pGasolina);

        if (calculo > 0.70) {
            System.out.println("Abasteça com gasolina!");
        } else {
            System.out.println("Abasteça com etanol!");
        }
    }*/
 /*
    
    Exercicio 03 - Desenvolva um algoritmo que crie três variáveis do tipo double (altura, peso e total). 
    A altura e peso deverá ser solicitada ao usuário e o total é o cálculo do IMC. Após o cálculo, 
    o valor deverá ser impresso no console.
    Obs.: Fórmula de cálculo do IMC
    IMC = Peso ÷ (Altura × Altura)
     */
 /*public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);          

        System.out.println("Digite o peso: ");   

        double peso = scanner.nextDouble();

        System.out.println("Digite a altura: ");   

        double altura = scanner.nextDouble();        

        double imc = peso / (altura * altura);        

        System.out.println("O valor do IMC é: " + imc);         
    
    }*/
 /*
    Exercício 04:
    Altere o algoritmo feito no exercício anterior para exibir a descrição dos valores de acordo com a tabela abaixo:
     */
 /* public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);          

        System.out.print("Digite o peso: ");   

        double peso = scanner.nextDouble();

        System.out.print("Digite a altura: ");   

        double altura = scanner.nextDouble();        

        double imc = peso / (altura * altura);        

       
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9){ 
            System.out.println("Normal");
        } if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso I");
        } else if (imc >= 30.0 && imc >= 39.9) {
            System.out.println("Obesidade II");
        } else if (imc >= 40.0 ) {
            System.out.println("Obesidade Grave III");
        }       
                         
    }*/
 /*
        Exercicio 05:
        Faça um algoritmo que imprima os valores pares de 0 até 100. Dica: Utilize o operador mod %(resto). Ex:
    
     */
 /*public static void main(String[] args) {

        System.out.println("Números pares:");

        for (int i = 0; i < 101; i++) {
                        
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }*/
 /*    
     Faça um programa em Java que receba como entrada um número do usuário e imprima o cálculo da sua tabuada 
     começando no número 0 até o 10. Utilize for ou while. 
    **Desafio, tente fazer o mesmo algoritmo que não precise receber a entrada do usuário e imprima a tabuada do 1 até o 10. 
     */
    /*public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int mult = scanner.nextInt();

        System.out.println("Tabuada do número: " + mult);

        for (int i = 0; i < 10; i++) {

            System.out.println(mult + " x " + i + " = " + mult * i);

        }

         
        
        //DESAFIO
         //for (int j = 1; j <= 10; j++) {

           // System.out.println("Tabuada do número: " + j);

            //for (int i = 0; i < 10; i++) {

              //  System.out.println(j + " x " + i + " = " + j * i);

            //}
        //}
    }*/
    
    
    /*
    
    Exercício 07:
    Faça um algoritmo que imprima os valores de 0 a 200 de forma decrescente.
    */
    public static void main(String[] args) {
        
        for (int i = 200; i >= 0; i--) {
            System.out.println("Número: "  + i);   
        }
    
    }
}
