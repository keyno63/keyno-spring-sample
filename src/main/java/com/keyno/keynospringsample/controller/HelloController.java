package com.keyno.keynospringsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.keyno.keynospringsample.service.HelloService;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private HelloService helloService;
    public HelloController(HelloService helloService)
    {
        this.helloService = helloService;
    }

    @GetMapping("/get")
    public String get()
    {
        return helloService.get();
    }

    @GetMapping("/map")
    public Map<String, String> map()
    {
        return Map.of("key", "value");
    }
}
