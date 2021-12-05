package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        Greeting response = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return response;
    }

    @GetMapping("/greetings")
    public Greeting greetingById(@RequestParam(value = "id", defaultValue = "100") String id){
        Greeting response = new Greeting(counter.incrementAndGet(), String.format(template, "you beautiful people on Twitter"));
        return response;
    }
}
