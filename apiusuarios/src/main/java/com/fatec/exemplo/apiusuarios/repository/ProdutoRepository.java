package com.fatec.exemplo.apiusuarios.repository;

import com.fatec.exemplo.apiusuarios.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContaining(String nome);

    List<Produto> findByPreco(double preco);
}
