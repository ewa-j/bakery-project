package com.codefirstgirls.model;

import lombok.Getter;

public enum Type {

    // Cake types
    SPONGE_CAKE("Vanilla Sponge Cake", 4.99),
    APPLE_PIE("Homemade Apple Pie", 5.49),
    CHOCOLATE_CAKE("Chocolate Fudge Cake", 6.25),
    BIRTHDAY_CAKE("Birthday Cake", 9.99);

    @Getter
    public final String displayName;

    @Getter
    public final double price;

    Type(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }
}
