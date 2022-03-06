/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

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
        double novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
    }

    public void sacar(double valor) {
        if (saldo > valor) {

            System.out.println("Saldo insuficiente!! Seu saldo atual é: " + this.saldo);
        } else {

            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
        }
    }

    public double investimento() {
        return this.saldo * 1.5;
    }

    public void imprimir() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo:" + this.saldo);
    }
}
