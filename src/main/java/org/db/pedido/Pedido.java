package org.db.pedido;

public class Pedido {
    private Produto produto;
    private int quantidade;
    private boolean clienteVip;
    private double valorTotal;

    public Pedido(Produto produto, int quantidade, boolean clienteVip) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.clienteVip = clienteVip;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public boolean isClienteVip() { return clienteVip; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}