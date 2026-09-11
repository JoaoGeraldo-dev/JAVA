package com.fatec.exemplo.apiusuarios.service;

import com.fatec.exemplo.apiusuarios.model.Usuario;
import com.fatec.exemplo.apiusuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Usuario> buscarPorNomeUsuario(String nome) {
        return repository.findByNome(nome);
    }

    public List<Usuario> contendoPorNomeUsuario(String nome) {
        return repository.findByNomeContaining(nome);
    }
}
