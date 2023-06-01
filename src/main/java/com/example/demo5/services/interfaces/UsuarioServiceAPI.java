package com.example.demo5.services.interfaces;

import com.example.demo5.domain.Usuario;

import java.util.List;

public interface UsuarioServiceAPI {
    Usuario get(Long id);
    List<Usuario> findAll();
    Usuario create(Usuario usuario);
    void update(Usuario usuario);
    void remove(Long id);
    Usuario findByEmail(String email);
}
