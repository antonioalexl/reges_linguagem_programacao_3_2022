/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.respostasexercicios;

/**
 *
 * @author alex.lopes
 */
public class Corretora {
    
    int numero;
    String titular;
    double saldo;
    String agencia;    
    
        
    
    public void depositar(double valor) {
         this.saldo = this.saldo +  valor;        
        
    }
    
    public void sacar(double valor) {                                     
        double novoSaldo = this.saldo  -  valor;
        this.saldo = novoSaldo;                                
    }   
   
    public double investimento() {               
        return this.saldo * 1.5;
    }    
    
    public void imprimir()
    {            
        System.out.println("Número:" + this.numero);
        System.out.println("Titular:" + this.titular);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Agência:" + this.agencia);               
       
    }
    
}
