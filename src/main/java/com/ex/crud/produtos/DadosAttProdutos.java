package com.ex.crud.produtos;

import jakarta.validation.constraints.NotNull;

public record DadosAttProdutos(
        @NotNull
        Long id,
        String nome,
        Double preco) {
}
