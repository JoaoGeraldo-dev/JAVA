package com.joao.estacionamento.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VeiculoController {

    @GetMapping("/ ")
    public String acessar(){
        return "/index";
    }

    @GetMapping("/cadastro")
    public String cadastrar(){
        return "/cadastrar";
    }


}
