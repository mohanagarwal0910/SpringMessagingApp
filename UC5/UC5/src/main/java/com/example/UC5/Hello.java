package com.example.UC5;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
