package com.example.carsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/cars")
    public String getCars() {

        return """
                <h1>Cars Website</h1>

                <ul>
                    <li>Toyota Supra</li>
                    <li>BMW M5</li>
                    <li>Audi R8</li>
                    <li>Ford Mustang</li>
                </ul>
                """;
    }
}
