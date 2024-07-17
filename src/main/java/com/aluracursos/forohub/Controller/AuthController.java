package com.aluracursos.forohub.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class AuthController {
    @GetMapping
    public String helloWorld(){
        return "Hola";
    }
}
