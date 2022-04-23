package com.incorta.sample.todo.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/malek")
public class AuthenticationResource {

    @PostMapping("/login")
    public String login(@RequestParam(value = "tenant") String tenant,
                        @RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpServletResponse response) {

        if ("demo".contentEquals(tenant) && "admin".contentEquals(username) && "admin".contentEquals(password)) {
            Cookie authCookie = new Cookie("session_id", "12345678");
            response.addCookie(authCookie);
            return "success";
        }

        return "failed";
    }

}
