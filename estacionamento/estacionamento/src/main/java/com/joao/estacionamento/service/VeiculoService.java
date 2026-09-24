package com.joao.estacionamento.service;

import com.joao.estacionamento.model.Veiculo;
import com.joao.estacionamento.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository){
        this.repository = repository;
    }


    public void salvar(Veiculo veiculo){
        repository.save(veiculo);
    }

    public List<Veiculo> listarVeiculos(){
        return repository.findAll();
    }


}
