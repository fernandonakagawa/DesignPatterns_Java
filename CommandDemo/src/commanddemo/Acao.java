/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddemo;

public class Acao {

    private String nome;
    private int quantidade;

    public Acao(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public void comprar() {
        System.out.println("Ação [ Nome: " + nome + ", Quantidade:" + quantidade + " ] compra.");
    }

    public void vender() {
        System.out.println("Ação [ Nome: " + nome + ", Quantidade:" + quantidade + " ] venda.");
    }
}
