package com.keyno.keynospringsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/get")
    public String get()
    {
        return "Hello World";
    }

    @GetMapping("/map")
    public Map<String, String> map()
    {
        return Map.of("key", "value");
    }
}
