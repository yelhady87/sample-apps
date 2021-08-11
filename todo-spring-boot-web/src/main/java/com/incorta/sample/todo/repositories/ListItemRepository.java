package com.incorta.sample.todo.repositories;

import com.incorta.sample.todo.domain.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {
}
