/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09.respostaexercicios;

/**
 *
 * @author USER
 */
public class Gerente extends Funcionario {
    
     private String senha;

    
     public Gerente(String nome) {
      super(nome);
    }

    public Gerente(String nome, String endereco) {
       super(nome,endereco);
    }

    public Gerente(String nome, String endereco, double salario) {
       super(nome,endereco,salario);
    }

    public Gerente(String nome, String endereco, double salario, String email) {
       super(nome,endereco,salario,email);
    }
    public Gerente(String nome, String endereco, double salario, String email, String senha) {
       super(nome,endereco,salario,email);
       this.senha = senha;
    }

    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
     public void imprimir(){
        System.out.println("Nome: " +  getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salario: " + getSalario());
        System.out.println("Email: " + getEmail()); 
         System.out.println("Senha: " + this.senha);
    }
}
