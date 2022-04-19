/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.respostaexercicios;

/**
 *
 * @author USER
 */
public class Funcionario {
    
    private String nome;
    private String endereco;
    private double salario;
    private String email;
     

  

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Funcionario(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public Funcionario(String nome, String endereco, double salario, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Salario: " + this.salario);
        System.out.println("Email: " + this.email); 
        System.out.println("Imprimir do funcionario");
    }
    
    public void aumentarSalario(double pAumento)
    {
        //this.salario =  this.salario + pAumento;
        this.salario += pAumento;
    }
}
