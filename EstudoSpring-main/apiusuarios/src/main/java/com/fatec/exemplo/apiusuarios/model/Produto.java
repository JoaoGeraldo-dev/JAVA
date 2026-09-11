package com.fatec.exemplo.apiusuarios.model;
import jakarta .persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataFabricacao;

    private double preco;

    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public Date getDataFabricacao(){
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }


}
