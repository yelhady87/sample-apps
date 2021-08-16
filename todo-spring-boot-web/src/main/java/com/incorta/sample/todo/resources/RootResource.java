package com.incorta.sample.todo.resources;

import com.incorta.sample.todo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RootResource {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Greeting root() {
        return new Greeting(counter.getAndIncrement(), String.format(TEMPLATE, "Root"));
    }


}
