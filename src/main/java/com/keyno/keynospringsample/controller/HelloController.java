package com.keyno.keynospringsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String get(
            @RequestParam String type_a,
            @RequestParam(required = false) String type_b
    )
    {
        return helloService.get(type_a, type_b);
    }

    @GetMapping("/map")
    public Map<String, String> map(
            @RequestParam(name = "key") String key,
            @RequestParam(name = "value") String value
    )
    {
        return Map.of(key, value);
    }
}
