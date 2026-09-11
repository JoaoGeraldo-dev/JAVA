package com.fatec.exemplo.apiusuarios.service;


import com.fatec.exemplo.apiusuarios.model.Cliente;
import com.fatec.exemplo.apiusuarios.model.Usuario;
import com.fatec.exemplo.apiusuarios.repository.ClienteRepository;
import com.fatec.exemplo.apiusuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;


    public List<Cliente> listarTodos(){
        return repository.findAll();
    }

    public Cliente salvar (Cliente cliente){
        return repository.save(cliente);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }


    public List<Cliente> buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }

<<<<<<< HEAD:EstudoSpring-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/service/ClienteService.java
    public List<Cliente> contendoPorNome(String nome) {
        return repository.findByNomeContaining(nome);

    }
=======
>>>>>>> 59ed8124a7d095b5c63d39c68e727d9b51ec510f:Spring-Boot-Example-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/service/ClienteService.java

    public List<Cliente> greater(Long codCliente){
        return repository.findBycodClienteGreaterThan(codCliente);
    }

    public List<Cliente> buscarPorLess(Long codCliente){
        return repository.findBycodClienteLessThan(codCliente);
    }

    public List<Cliente> buscarPorNomeCliente(String nome) {
        return repository.findByNome(nome);
    }

    public List<Cliente> contendoPorNomeCliente(String nome) {
        return repository.findByNomeContaining(nome);

    }




}

