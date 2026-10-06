package com.uninter.baozistore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uninter.baozistore.model.Cliente;
import com.uninter.baozistore.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // POST - criar
    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    // GET - listar todos
    @GetMapping
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    // GET /{id} - consultar por ID
    @GetMapping("/{id}")
    public Cliente consultarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null); 
    }

    // DELETE /{id} - apagar
    @DeleteMapping("/{id}")
    public void apagar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}