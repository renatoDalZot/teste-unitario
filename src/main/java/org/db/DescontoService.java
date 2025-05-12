package org.db;

public class DescontoService {
    public double aplicarDesconto(double valorCompra) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        } else if (valorCompra < 100) {
            return valorCompra; // Sem desconto
        } else if (valorCompra <= 500) {
            return valorCompra * 0.9; // 10% de desconto
        } else {
            return valorCompra * 0.8; // 20% de desconto
        }
    }
}
