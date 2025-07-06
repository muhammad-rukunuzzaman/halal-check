package com.example.halalcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/code")
public class FoodCodeController {
    private final FoodCodeRepository repository;

    public FoodCodeController(FoodCodeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{code}")
    public FoodCode check(@PathVariable String code) {
        return repository.findById(code).orElse(null);
    }
}
