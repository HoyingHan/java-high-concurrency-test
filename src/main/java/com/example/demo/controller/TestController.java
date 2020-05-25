package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/watch")
    public String testWatch() {
        for (int i = 0; i < 100; i++) {
            byte[] tmp = new byte[1024 * 1024 * 256];

        }
        return "see";
    }

}
