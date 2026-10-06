package com.uninter.baozistore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uninter.baozistore.model.Produto;
import com.uninter.baozistore.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    // POST - criar produto
    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    // GET - listar todos os produtos
    @GetMapping
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    // GET /{id} - consultar produto por ID
    @GetMapping("/{id}")
    public Produto consultarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE /{id} - apagar produto
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}