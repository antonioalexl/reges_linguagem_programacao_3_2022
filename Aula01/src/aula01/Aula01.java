/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author alex.lopes
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
   /*public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Seu nome é:" + nome + " e sua idade é: " + idade);
        

    }*/
 /* public static void main(String[] args) {             
        
        String nome = JOptionPane.showInputDialog("Digite seu nome:" );
        
        String idade = JOptionPane.showInputDialog("Digite sua idade:" );                       
        
        JOptionPane.showMessageDialog(null, "Seu nome é:" + nome + " e sua idade é: " + idade);
       
    }*/
 /*public static void main(String[] args) {             
        
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite o faturamento de janeiro:");
         int faturamentoJaneiro = scanner.nextInt();
         
         System.out.print("Digite o faturamento de fevereiro:");
         int faturamentoFevereiro = scanner.nextInt();
         
         System.out.print("Digite o faturamento de março:");
         int faturamentoMarco = scanner.nextInt();
         
         int faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;
         
         System.out.printf("\n O faturamento do trimestre é: %d", faturamentoTrimestre);       
    }*/
 /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome:");

        String nome = scanner.next();
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }*/
 /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome:");

        String nome = scanner.next();
        int i = 0;
        
        do{
            System.out.println(nome);
            i = i + 1;
         } while (i < 10) ;
    }*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");

        int numero = scanner.nextInt();

        boolean maior10 = numero > 10 ? true : false;

        System.out.println("O número é maior que 10? - " + (maior10 ? "Sim": "Não"));

    }
    
}
