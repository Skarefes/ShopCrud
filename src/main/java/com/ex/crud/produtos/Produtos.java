package com.ex.crud.produtos;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity (name = "Produtos")
@Table (name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produtos {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    public Produtos() {}

    public Produtos(CadastroCompra dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void atualizarInformacoes(@Valid DadosAttProdutos dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.preco() != null){
            this.preco = dados.preco();
        }
    }

}
