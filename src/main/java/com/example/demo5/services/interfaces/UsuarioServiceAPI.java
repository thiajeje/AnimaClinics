package com.example.demo5.services.interfaces;
import com.example.demo5.domain.Usuario;
import java.util.List;

public interface UsuarioServiceAPI {

    public Usuario get(Long id);

    public List<Usuario> findAll();

    public Usuario create(Usuario user);

    public void update(Usuario user);

    public void remove(Long id);
}
