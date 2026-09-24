package com.joao.estacionamento.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String placa;
    private String modelo;
    private String tipo;

    public Veiculo(){

    }

    public Veiculo(String placa, String modelo, String tipo){
        this.modelo = modelo;
        this.placa = placa;
        this.tipo = tipo;
    }

    public long getId(){
        return id;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getTipo(){
        return tipo;
    }


}
