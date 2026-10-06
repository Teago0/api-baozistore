package com.uninter.baozistore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uninter.baozistore.model.Pedido;
import com.uninter.baozistore.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    // POST - criar pedido
    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return repository.save(pedido);
    }

    // GET - listar todos os pedidos
    @GetMapping
    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    // GET /{id} - consultar pedido por ID
    @GetMapping("/{id}")
    public Pedido consultarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE /{id} - apagar pedido
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}