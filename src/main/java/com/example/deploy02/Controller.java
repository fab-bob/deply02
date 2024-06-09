package com.example.deploy02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("sum")
    public int sum (@RequestParam int a, @RequestParam int b) {
        return (a + b);
    }
}
