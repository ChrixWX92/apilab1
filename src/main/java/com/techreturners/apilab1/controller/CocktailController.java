package com.techreturners.apilab1.controller;

import com.techreturners.apilab1.Cocktail;
import com.techreturners.apilab1.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CocktailController {

    @GetMapping("/cocktail")
    public Cocktail cocktail(@RequestParam(value = "id", defaultValue = "1") int id) {
        return new Cocktail(id);
    }

}
