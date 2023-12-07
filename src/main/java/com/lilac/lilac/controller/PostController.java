package com.lilac.lilac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    //SSR -> jsp, thymeleaf, mustache, freemarker
    // html rendering
    //SPA -> vue, react,
    // javasciprt <-> API(JSON)

    // HTTP METHOD
    // GET,POST,PUT,PATCH,DELETE, CONNECT, OPTIONS, TRACE, PATCH
    @GetMapping("/posts")
    public String get(){
        return "sex";
    }
}
