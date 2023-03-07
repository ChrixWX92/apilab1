package com.techreturners.apilab1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CocktailControllerTests {
    @Autowired
    private MockMvc mockMvcController;
    @Test
    public void testGetCocktailWithoutRequestParams() throws Exception {
        String expectedValue = "Mojito";
        this.mockMvcController.perform(
                MockMvcRequestBuilders.get("/cocktail"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").
                        value(expectedValue));
    }
    @Test
    public void testGetCocktailWithRequestParams() throws Exception {
        for (int i = 12; i < 20; i++) {
            String expectedValue = switch(i) {
                case 12 -> "Tom Collins";
                case 13 -> "Daiquiri";
                case 14 -> "Pina Colada";
                case 15 -> "Dark 'N' Stormy";
                case 16 -> "Blue Hawaii";
                case 17 -> "Hurricane";
                case 18 -> "Zombie";
                case 19 -> "Cuba Libre";
                default -> throw new IllegalStateException("Unexpected value: " + i);
            };
            this.mockMvcController.perform(
                    MockMvcRequestBuilders.get("/cocktail").param("id",
                            String.valueOf(i)))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.name").
                            value(expectedValue));
        }
    }
}
