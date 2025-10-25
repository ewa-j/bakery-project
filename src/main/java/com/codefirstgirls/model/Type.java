package com.codefirstgirls.model;

import lombok.Getter;

public enum Type {

    // Bread types
    SOURDOUGH("Sourdough Bread", 2.99),
    BAGUETTE("French Baguette", 3.49),
    WHOLE_WHEAT("Whole Wheat Loaf", 2.79),

    // Cake types
    SPONGE_CAKE("Vanilla Sponge Cake", 4.99),
    APPLE_PIE("Homemade Apple Pie", 5.49),
    CHOCOLATE_CAKE("Chocolate Fudge Cake", 6.25),
    BIRTHDAY_CAKE("Birthday Cake", 9.99),

    // Pastry types
    CROISSANT("Butter Croissant", 2.59),
    CINNAMON_ROLL("Cinnamon Roll", 3.25),
    DANISH_PASTRY("Raspberry Danish Pastry", 3.75);

    @Getter
    public final String displayName;

    @Getter
    public final double price;

    Type(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }
}
