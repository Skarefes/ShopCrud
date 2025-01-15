package com.ex.crud.produtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastroCompra(
        @NotBlank
        String nome,
        @NotNull
        Double preco
) {
}
