package com.joao.estacionamento.controller;


import org.springframework.web.bind.annotation.PathVariable;
import com.joao.estacionamento.model.Veiculo;
import com.joao.estacionamento.service.VeiculoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VeiculoController {

    private VeiculoService service;

    public VeiculoController(VeiculoService service){
        this.service = service;
    }

    @GetMapping("/")
    public String acessar(){
        return "index";
    }

    @PostMapping("/cadastro")
    public String cadastrar(String placa, String modelo, String tipo){
        service.salvar(new Veiculo(placa, modelo, tipo));

        return "redirect:/cadastro";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @GetMapping("/veiculos")
    public String listar(Model model){
        service.listarVeiculos();
        model.addAttribute("veiculos", service.listarVeiculos());
        return "veiculos";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id){
        service.excluirVeiculo(id);
        return "redirect:/veiculos";
    }





}
