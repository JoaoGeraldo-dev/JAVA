package com.fatec.exemplo.apiusuarios.controller;

import com.fatec.exemplo.apiusuarios.model.Cliente;
import com.fatec.exemplo.apiusuarios.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web/clientes")
public class WebClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/novo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cadastro_cliente";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cliente cliente) {
        clienteService.salvar(cliente);
        return "cadastro_cliente";
    }

    @GetMapping("/lista")
<<<<<<< HEAD:EstudoSpring-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/controller/WebClienteController.java
    public String listar(@RequestParam(required = false) String nome, Model model) {
        List<Cliente> clientes = (nome == null || nome.isEmpty())
                ? clienteservice.listarTodos()
                : clienteservice.contendoPorNome(nome);

        model.addAttribute("clientes", clientes);
        return "lista_cliente";
    }
}
=======
    public  String Listar(@RequestParam(required = false) String nome, Model model) {
        List<Cliente> clientes = (nome == null || nome.isEmpty())
                ? clienteService.ListarClientes()
                : clienteService.contendoPorNomeCliente(nome);
        model.addAttribute("clientes: ", clientes);
        return "lista";
    }
}
>>>>>>> 59ed8124a7d095b5c63d39c68e727d9b51ec510f:Spring-Boot-Example-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/controller/WebClienteController.java
