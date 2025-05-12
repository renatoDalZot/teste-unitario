package org.db.pedido;

public class PedidoService {

    public void processarPedido(Pedido pedido) {
        Produto produto = pedido.getProduto();
        int quantidade = pedido.getQuantidade();

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        produto.reduzirEstoque(quantidade);

        double valorProdutos = produto.getPreco() * quantidade;

        double desconto = 0.0;
        if (pedido.isClienteVip()) {
            desconto = valorProdutos * 0.10;
        } else if (quantidade >= 10) {
            desconto = valorProdutos * 0.05;
        }

        double valorComDesconto = valorProdutos - desconto;

        double frete = calcularFrete(valorComDesconto);
        double total = valorComDesconto + frete;

        pedido.setValorTotal(total);
    }

    private double calcularFrete(double valor) {
        if (valor > 300) {
            return 0;
        } else if (valor > 100) {
            return 15;
        } else {
            return 30;
        }
    }
}
