package com.example.demo5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.demo5.domain.Usuario;
import com.example.demo5.services.interfaces.UsuarioServiceAPI;
import javax.annotation.security.PermitAll;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin()
public class UsuarioController {

    private final UsuarioServiceAPI userService;

    @Autowired
    public UsuarioController(UsuarioServiceAPI userService) {
        this.userService = userService;
    }

    @GetMapping
    @PermitAll
    public HttpEntity<List<Usuario>> findAll() {
        List<Usuario> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "/{id}")
    public HttpEntity<Usuario> get(@PathVariable(name = "id") Long id) {
        Usuario usuario = userService.get(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public HttpEntity<Usuario> create(@RequestBody Usuario usuario) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encryptedPassword = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(encryptedPassword);

        usuario = userService.create(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping(value = "/{id}")
    public HttpEntity<Usuario> update(@PathVariable(name = "id") Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        userService.update(usuario);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public HttpEntity<Usuario> remove(@PathVariable(name = "id") Long id) {
        userService.remove(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    @PermitAll
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        Usuario existingUsuario = userService.findByEmail(usuario.getEmail());

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (existingUsuario != null && passwordEncoder.matches(usuario.getSenha(), existingUsuario.getSenha())) {
            return ResponseEntity.ok("Login efetuado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("E-mail ou senha inválido!");
        }
    }
}
