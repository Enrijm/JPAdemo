package com.example.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {
    // for interacting with the DB
    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    @GetMapping
    public List<Usuario> getAll(){
        return usuarioRepositorio.findAll();
    }
    @PostMapping
    public Usuario añadirUsuario(@RequestBody Usuario usu){
        System.out.println("En el controlador de post");
        usuarioRepositorio.save(usu);
        return usu;
    }

    @GetMapping("{id}")
    public Usuario getId(@PathVariable String id) throws Exception
    {
        return usuarioRepositorio.findById(id).orElseThrow( () -> new Exception( "No encontrado"));
    }
}
