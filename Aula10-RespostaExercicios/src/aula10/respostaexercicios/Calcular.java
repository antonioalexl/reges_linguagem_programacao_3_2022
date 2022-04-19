/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.respostaexercicios;

/**
 *
 * @author USER
 */
public class Calcular {

    private double total;

    public Calcular(double p1, double p2) {
        // somar(p1, p2);
        total = p1 + p2;

    }

    public Calcular(double p1, double p2, double p3) {
        // somar(p1, p2);
        total = p1 + p2 + p3;

    }

    public Calcular(double p1, double p2, double p3, double p4) {
        // somar(p1, p2);
        total = p1 + p2 + p3 + p4;

    }

    public Calcular(double p1, double p2, double p3, double p4, double p5) {
        // somar(p1, p2);
        total = p1 + p2 + p3 + p4 + p5;

    }
    
    
    public double somar(double p1, double p2) {
        this.total = p1 + p2;
        return this.total;
    }

    public double somar(double p1, double p2, double p3) {
        this.total = p1 + p2 + p3;
        return this.total;
    }

    public double somar(double p1, double p2, double p3, double p4) {
        this.total = p1 + p2 + p3 + p4;
        return this.total;
    }

    public double somar(double p1, double p2, double p3, double p4, double p5) {
        this.total = p1 + p2 + p3 + p4 + p5;
        return this.total;
    }
    
    public double getTotal()
    {
        return total;
    }
    
}
