package com.fatec.exemplo.apiusuarios.controller;


import com.fatec.exemplo.apiusuarios.model.Usuario;
import com.fatec.exemplo.apiusuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("web/usuarios")

public class WebUsuarioController {

    @Autowired
<<<<<<< HEAD:EstudoSpring-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/controller/WebUsuarioController.java
    private UsuarioService usuarioservice;
=======
    private UsuarioService usuarioService;
>>>>>>> 59ed8124a7d095b5c63d39c68e727d9b51ec510f:Spring-Boot-Example-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/controller/WebUsuarioController.java


    @GetMapping("/novo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario) {
        usuarioService.salvar(usuario);
        return "cadastro";
    }

    @GetMapping("/lista")
<<<<<<< HEAD:EstudoSpring-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/controller/WebUsuarioController.java
    public String listar(@RequestParam(required = false) String nome, Model model) {
        List<Usuario> usuarios = (nome == null || nome.isEmpty())
                ? usuarioservice.listarTodos()
                : usuarioservice.buscarPorNomeUsuario(nome);
        model.addAttribute("usuarios", usuarios);
        return "lista";
    }
=======
    public  String Listar(@RequestParam(required = false) String nome, Model model) {
        List<Usuario> usuarios = (nome == null || nome.isEmpty())
                ? usuarioService.listarTodos()
                : usuarioService.contendoPorNomeUsuario(nome);
        model.addAttribute("usuarios", usuarios);
        return "lista";
            }




>>>>>>> 59ed8124a7d095b5c63d39c68e727d9b51ec510f:Spring-Boot-Example-main/apiusuarios/src/main/java/com/fatec/exemplo/apiusuarios/controller/WebUsuarioController.java
}
