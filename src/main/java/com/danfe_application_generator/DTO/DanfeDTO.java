package com.danfe_application_generator.DTO;

import java.util.List;

public record DanfeDTO(
        String numero,             // Número da nota fiscal
        String dataEmissao,        // Data de emissão
        String emitente,           // Nome/Razão social do emitente
        String cnpjEmitente,       // CNPJ do emitente
        String destinatario,       // Nome do destinatário
        List<Produtos> produtos,   // Lista de produtos vendidos
        double valorTotalProdutos  // Valor total dos produtos
) {
}
