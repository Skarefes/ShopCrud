package com.ex.crud.produtos;

public record listaProdutos(String nome, Double preco) {
    public listaProdutos(Produtos produtos) {
        this(produtos.getNome(), produtos.getPreco());
    }
}
