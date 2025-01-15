package com.ex.crud.controller;

import com.ex.crud.produtos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroCompra dados){
        repository.save(new Produtos(dados));
    }

    @GetMapping
    public Page<listaProdutos> listar(Pageable pageable){
       return repository.findAll(pageable).map(listaProdutos::new);
    }

    @PutMapping
    @Transactional
    public void modificar (@RequestBody @Valid DadosAttProdutos dados){
        var produto = repository.getReferenceById(dados.id());
        produto.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }

}
