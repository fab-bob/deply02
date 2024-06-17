package com.example.deploy02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class Controller {

    @Autowired
    Environment environment;

    @GetMapping("sum")
    public int sum () {
        int a = Integer.parseInt(Objects.requireNonNull(environment.getProperty("a")));
        int b = Integer.parseInt(Objects.requireNonNull(environment.getProperty("b")));
        return (a + b);
    }
}
