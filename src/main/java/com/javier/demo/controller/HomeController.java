package com.javier.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String getWelcomeMessage(){ return "Eyy bienvenido a mi super app" ;};

    @GetMapping("/bienvenido")
    public String getMessageWithName(@RequestParam(value="name", defaultValue = "there") String name) {
        return String.format("Hey %s! Bienvenido a esta aplicación", name);
    }

}
