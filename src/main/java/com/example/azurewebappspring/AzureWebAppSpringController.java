package com.example.azurewebappspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureWebAppSpringController {
    @RequestMapping("/")
    public  String helloWorld() {
        return "Hello World!!!";
    }
}
