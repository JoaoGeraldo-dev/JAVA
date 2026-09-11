package com.fatec.exemplo.apiusuarios.service;

import com.fatec.exemplo.apiusuarios.model.Produto;
import com.fatec.exemplo.apiusuarios.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarTodos(){
        return repository.findAll();
    }

    public Produto Salvar(Produto produto){
        return repository.save(produto);
    }

    public List<Produto>buscarPorNome(String nome){
        return repository.findByNomeContaining(nome);
    }

    public List<Produto> buscarPorPreco(double preco){
        return repository.findByPreco(preco);
    }

    public void deletar(Long id){
         repository.deleteById(id);
    }


}
