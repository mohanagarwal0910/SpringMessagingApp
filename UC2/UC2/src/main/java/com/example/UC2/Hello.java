package com.example.UC2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
