package com.incorta.sample.todo;

import com.incorta.sample.todo.domain.ListItem;
import com.incorta.sample.todo.resources.TodoResource;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ListItemsModelAssembler implements RepresentationModelAssembler<ListItem, EntityModel<ListItem>> {
    @Override
    public EntityModel<ListItem> toModel(ListItem item) {

        return EntityModel.of(item,
                linkTo(methodOn(TodoResource.class).getById(item.getId())).withSelfRel(),
                linkTo(methodOn(TodoResource.class).list()).withRel("items"));
    }
}
