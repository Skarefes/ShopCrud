package com.ex.crud.produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
}
