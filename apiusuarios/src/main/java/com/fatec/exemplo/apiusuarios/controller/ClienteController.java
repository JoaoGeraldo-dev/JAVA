package com.fatec.exemplo.apiusuarios.controller;

import com.fatec.exemplo.apiusuarios.model.Cliente;
import com.fatec.exemplo.apiusuarios.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/buscar")
    public List<Cliente> buscarPorNome(@RequestParam String nome) {
        return service.contendoPorNome(nome);
    }

    @GetMapping("/greater")
    public List<Cliente> clienteGreater(@RequestParam Long codCliente) {
        return service.greater(codCliente);
    }

    @GetMapping("/less")
    public List<Cliente> clienteLess(@RequestParam Long codCliente) {
        return service.buscarPorLess(codCliente);
    }
}
