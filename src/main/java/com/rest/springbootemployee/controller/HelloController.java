package com.rest.springbootemployee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping(path = "/{userName}")
    public String getAll(@PathVariable String userName) {

        return "Hello:" + userName;
    }
}
