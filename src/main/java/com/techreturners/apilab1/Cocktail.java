package com.techreturners.apilab1;

public class Cocktail {

    private final long id;
    private final String name;

    public Cocktail(int id) {
        this.id = id;
        this.name = switch(id) {
            case 2 -> "Sidecar";
            case 3 -> "Singapore Sling";
            case 4 -> "Old Fashioned";
            case 5 -> "Mai Tai";
            case 6 -> "Margarita";
            case 7 -> "Martini";
            case 8 -> "Bloody Mary";
            case 9 -> "Cosmopolitan";
            case 10 -> "Bellini";
            case 11 -> "Manhattan";
            case 12 -> "Tom Collins";
            case 13 -> "Daiquiri";
            case 14 -> "Pina Colada";
            case 15 -> "Dark 'N' Stormy";
            case 16 -> "Blue Hawaii";
            case 17 -> "Hurricane";
            case 18 -> "Zombie";
            case 19 -> "Cuba Libre";
            case 20 -> "White Russian";
            case 21 -> "Midori Sour";
            case 22 -> "Woo Woo";
            case 23 -> "Caipirinha";
            case 24 -> "Mimosa";
            case 25 -> "Espresso Martini";
            case 26 -> "Whiskey Sour";
            case 27 -> "Negroni";
            case 28 -> "Long Island Iced Tea";
            case 29 -> "Tequila Sunrise";
            case 30 -> "Sex on the Beach";
            case 31 -> "Moscow Mule";
            case 32 -> "B-52";
            default -> "Mojito";
        };
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
