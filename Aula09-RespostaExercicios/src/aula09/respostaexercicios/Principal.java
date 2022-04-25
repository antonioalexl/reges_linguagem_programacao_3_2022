/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09.respostaexercicios;

/**
 *
 * @author USER
 */
public class Principal {
    
    public static void main(String[] args)
    {
       Funcionario fun = new Funcionario("Teste", "Vila do Chaves", 0, "teste@reges.edu.br");
        fun.imprimir();
        System.out.println("---------------------");
        
        Gerente gerente = new Gerente("Chefão", "Vila Amamaria", 15, "teste@gerente.com", "123456");
        gerente.imprimir();
        
        System.out.println("---------------------");
        Supervisor supervisor = new Supervisor("Chefão", "Vila Amamaria", 15, "teste@gerente.com", "24/36");
        supervisor.imprimir();
    }
}
