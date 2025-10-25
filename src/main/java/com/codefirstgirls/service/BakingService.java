package com.codefirstgirls.service;

import com.codefirstgirls.model.Cake;
import com.codefirstgirls.model.Type;

import java.util.ArrayList;
import java.util.List;

public class BakingService {

    public List<Cake> getCakes(int amount, Type type) {
        List<Cake> cakes = new ArrayList<>();
        if (amount > 0) {
            logBakingProcess(type);
            for (int i=0; i<amount; i++) {
                Cake cake = bakeCake(type);
                cakes.add(cake);
            }
        }
        return cakes;
    }

    public double calculatePrice(int amount, Type type) {
        return amount * type.getPrice();
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

