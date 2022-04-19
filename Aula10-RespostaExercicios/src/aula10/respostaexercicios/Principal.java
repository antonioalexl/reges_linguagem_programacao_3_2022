/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.respostaexercicios;

/**
 *
 * @author USER
 */
public class Principal {
    
    public static void main(String[] args)
    {
    
        Calcular calc = new Calcular(8,9);
        System.out.println("Total: " + calc.getTotal() );
        
        Calcular calc2 = new Calcular(8,9,10);
        System.out.println("Total Tres parametros: " + calc2.getTotal() );
        
        Calcular calc4 = new Calcular(8,9,10,15);
        System.out.println("Total quatro parametros: " + calc4.getTotal() );
        
        System.out.println("Somar com dois parametros: " + calc.somar(3.5, 5.5));
        System.out.println("Somar com três parametros: " + calc.somar(5.5, 5.8, 18));
        System.out.println("Somar com quatro parametros: " + calc.somar(7.5, 9.5, 42));
        System.out.println("Somar com cinco parametros: " + calc.somar(6.5, 4.5, 8.8, 9.8, 10.8));
        
        
        Funcionario func = new Funcionario("João");
        func.setSalario(2000);
        func.aumentarSalario(50);
        System.out.println("Salario do João: " + func.getSalario());
        
        
         Gerente gerente = new Gerente("Mario");
        gerente.setSalario(2000);
        gerente.aumentarSalario(50);
        System.out.println("Salario do Mario: " + gerente.getSalario());
        
        
        Supervisor supervisor = new Supervisor("Raul");
        supervisor.setSalario(2000);
        supervisor.aumentarSalario(50);
        System.out.println("Salario do Raul: " + supervisor.getSalario());
        
        
        
        
        
    }
}
