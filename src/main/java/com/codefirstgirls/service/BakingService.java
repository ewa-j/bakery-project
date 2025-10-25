package com.codefirstgirls.service;

import com.codefirstgirls.model.*;

import java.util.ArrayList;
import java.util.List;

public class BakingService {

    public List<BakeryItem> getItems(int amount, Type type) {
        List<BakeryItem> items = new ArrayList<>();

        if (amount > 0) {
            logBakingProcess(type);
            for (int i = 0; i < amount; i++) {
                items.add(bakeItem(type));
            }
        }
        return items;
    }


    public double calculatePrice(int amount, Type type) {
        return amount * type.getPrice();
    }

    private BakeryItem bakeItem(Type type) {
        return switch (type) {
            case SPONGE_CAKE, APPLE_PIE, CHOCOLATE_CAKE, BIRTHDAY_CAKE -> bakeCake(type);
            case CROISSANT, CINNAMON_ROLL, DANISH_PASTRY -> new Pastry(type);
            case SOURDOUGH, BAGUETTE, WHOLE_WHEAT -> new Bread(type);
        };
    }

    private Cake bakeCake(Type type) {
        Cake cake = new Cake(type);
        cake.setCustomNote(type == Type.BIRTHDAY_CAKE ? "Happy Birthday!" : "n/a");
        return cake;
    }

    private void logBakingProcess(Type type) {
        System.out.println("Baking a fresh " + type.getDisplayName() + "...");
    }
}
