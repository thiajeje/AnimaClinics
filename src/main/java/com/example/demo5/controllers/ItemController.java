package com.example.demo5.controllers;

import com.example.demo5.domain.Item;
import com.example.demo5.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemRepository ItemRepository;

    @GetMapping
    public List<Item> findAll() {
        List<Item> itens = ItemRepository.findAll();
        return itens;
    }

    @GetMapping(value = "/{id}")
    public Item get(@PathVariable(name = "id") Long id) {
        Item itens = ItemRepository.findById(id).orElse(null);
        return itens;
    }

    @PostMapping
    public Item create(@RequestBody Item itens) {
        itens = ItemRepository.save(itens);
        return itens;
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable(name = "id") Long id,
                       @RequestBody Item itens) {
        itens.setId(id);
        itens = ItemRepository.save(itens);
    }

    @DeleteMapping(value = "/{id}")
    public void remove(@PathVariable(name = "id") Long id) {
        ItemRepository.deleteById(id);
    }
}
