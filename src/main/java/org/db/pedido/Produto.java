package org.db.pedido;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() { return preco; }

    public void reduzirEstoque(int quantidade) {
        if (quantidade > estoque) {
            throw new IllegalArgumentException("Estoque insuficiente para o produto: " + nome);
        }
        estoque -= quantidade;
    }
}