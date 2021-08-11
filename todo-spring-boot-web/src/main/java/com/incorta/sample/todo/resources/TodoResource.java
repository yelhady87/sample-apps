package com.incorta.sample.todo.resources;

import com.incorta.sample.todo.ListItemsModelAssembler;
import com.incorta.sample.todo.domain.ListItem;
import com.incorta.sample.todo.exceptions.ItemNotFoundException;
import com.incorta.sample.todo.repositories.ListItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TodoResource {

    @Autowired
    ListItemRepository listItemRepository;

    @Autowired
    ListItemsModelAssembler itemsAssembler;

    @GetMapping("/todo/items")
    public CollectionModel<EntityModel<ListItem>> list() {
        List<EntityModel<ListItem>> items = listItemRepository.findAll()
                .stream()
                .map(itemsAssembler::toModel).collect(Collectors.toList());

        return CollectionModel.of(items, linkTo(methodOn(TodoResource.class).list()).withSelfRel());
    }

    @GetMapping("/todo/items/{id}")
    public EntityModel<ListItem> getById(
            @PathVariable
            Long id) {
        ListItem item = listItemRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
        return itemsAssembler.toModel(item);
    }

    @PostMapping("/todo/items")
    public ListItem add(
            @RequestBody
            ListItem item) {
        return listItemRepository.save(item);
    }
}
