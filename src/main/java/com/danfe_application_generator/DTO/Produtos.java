package com.danfe_application_generator.DTO;

public record Produtos(
        String produto,            // Produto vendido
        Double quantidade,            // Quantidade
        double valorUnitario       // Valor unitário do produto
) {
}
