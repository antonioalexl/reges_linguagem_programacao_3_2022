/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.respostaexercicios;

/**
 *
 * @author USER
 */
public class Supervisor extends Funcionario {

    private String turno;

    public Supervisor(String nome) {
        super(nome);
    }

    public Supervisor(String nome, String endereco) {
        super(nome, endereco);
    }

    public Supervisor(String nome, String endereco, double salario) {
        super(nome, endereco, salario);
    }

    public Supervisor(String nome, String endereco, double salario, String email) {
        super(nome, endereco, salario, email);
    }

    public Supervisor(String nome, String endereco, double salario, String email, String turno) {
        super(nome, endereco, salario, email);
        this.turno = turno;

    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salario: " + getSalario());
        System.out.println("Email: " + getEmail());
        System.out.println("Turno: " + this.turno);
    }

    @Override
    public void aumentarSalario(double pAumento) {
       this.setSalario( (getSalario() + pAumento) * 1.3); 
    }

}
