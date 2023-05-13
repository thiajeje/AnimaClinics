package com.example.demo5.Service;

import com.example.demo5.domain.Usuario;
import com.example.demo5.exceptions.UsuarioNotFoundException;
import com.example.demo5.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo5.services.interfaces.UsuarioServiceAPI;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UsuarioService implements UsuarioServiceAPI {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario get(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new UsuarioNotFoundException("Produto não encontrado"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Usuario usuario) {
        repository.save(usuario);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
