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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*EXERCICIO 01*/
        Contato contato1 = new Contato();
        contato1.nome = "Alex Lopes";
        contato1.endereco = "Rua teste";
        contato1.email = "antonio.alex@hotmail.com";
        contato1.telefone = "16993300758";

        System.out.println("Nome: " + contato1.nome);
        System.out.println("Endereço: " + contato1.endereco);
        System.out.println("Email: " + contato1.email);
        System.out.println("Telefone: " + contato1.telefone);

        System.out.println("---------------------");

        Contato contato2 = new Contato();
        contato2.nome = "Antonio Alex Lopes";
        contato2.endereco = "Rua Da Faculdade";
        contato2.email = "antonio.alex@gmail.com";
        contato2.telefone = "16993300758";

        System.out.println("Nome: " + contato2.nome);
        System.out.println("Endereço: " + contato2.endereco);
        System.out.println("Email: " + contato2.email);
        System.out.println("Telefone: " + contato2.telefone);

        System.out.println("---------------------");

        Contato contato3 = new Contato();
        contato3.nome = "Lopes";
        contato3.endereco = "Rua Noboru Nisiyama, 21";
        contato3.email = "antonio.alex@hotmail.com";
        contato3.telefone = "16993300758";

        System.out.println("Nome: " + contato3.nome);
        System.out.println("Endereço: " + contato3.endereco);
        System.out.println("Email: " + contato1.email);
        System.out.println("Telefone: " + contato3.telefone);

        System.out.println("---------------------");

        Contato contato4 = new Contato();
        contato4.nome = "Antonio Gabriel";
        contato4.endereco = "Rua Moacir Sevieri";
        contato4.email = "gabriel@hotmail.com";
        contato4.telefone = "16993300758";

        System.out.println("Nome: " + contato4.nome);
        System.out.println("Endereço: " + contato4.endereco);
        System.out.println("Email: " + contato4.email);
        System.out.println("Telefone: " + contato4.telefone);
        System.out.println("---------------------");

        Corretora corretora = new Corretora();
        corretora.depositar(80000);
        corretora.agencia = "123445";
        corretora.numero = 1353;
        corretora.titular = "Antonio Alex Lopes";

        corretora.imprimir();

        System.out.println("---------------------");

        corretora.sacar(70000);

        corretora.imprimir();
        System.out.println("---------------------");

    }

}
