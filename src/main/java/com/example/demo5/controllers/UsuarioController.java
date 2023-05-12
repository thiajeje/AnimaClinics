package com.example.demo5.controllers;

import com.example.demo5.domain.Usuario;
import com.example.demo5.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @GetMapping(value = "/{id}")
    public Usuario get(@PathVariable(name = "id") Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        return usuario;
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        usuario = usuarioRepository.save(usuario);
        return usuario;
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable(name = "id") Long id,
                       @RequestBody Usuario usuario) {
        usuario.setId(id);
        usuario = usuarioRepository.save(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void remove(@PathVariable(name = "id") Long id) {
        usuarioRepository.deleteById(id);
    }
}
