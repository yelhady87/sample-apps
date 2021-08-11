package com.incorta.sample.todo;

import com.incorta.sample.todo.domain.ListItem;
import com.incorta.sample.todo.repositories.ListItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ListItemRepository listItemRepository) {
        return args -> {

            log.info("Preloading " + listItemRepository.save(new ListItem("Get item 1")));
            log.info("Preloading " + listItemRepository.save(new ListItem("Get item 2")));
            log.info("Preloading " + listItemRepository.save(new ListItem("Get item 3 with description", "3rd item with a description")));
        };
    }
}
