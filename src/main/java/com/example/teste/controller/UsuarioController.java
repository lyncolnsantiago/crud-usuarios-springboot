package com.example.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.teste.model.Usuario;
import com.example.teste.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioservice;

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {

        model.addAttribute("usuarios", usuarioservice.listarTodos());

        return "usuarios";
    }

    @PostMapping("/usuarios/salvar")
    public String salvarUsuario(@ModelAttribute Usuario usuario) {

        usuarioservice.salvar(usuario);

        return "redirect:/usuarios";
    }

}
