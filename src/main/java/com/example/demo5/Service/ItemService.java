package com.example.demo5.Service;

import com.example.demo5.domain.Item;
import com.example.demo5.exceptions.ItemNotFoundException;
import com.example.demo5.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> listarTodos() {
        return itemRepository.findAll();
    }

    public Item buscarPorId(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(()-> new ItemNotFoundException("Item não encontrado"));
    }

    public Item salvar(Item item) {
        return itemRepository.save(item);
    }

    public void excluir(Long id) {
        itemRepository.deleteById(id);
    }
}
