package com.codefirstgirls.model;


public class Pastry extends BakeryItem{

    public Pastry(Type type) {
        super(type);
    }

    @Override
    public String displayItem() {
        return String.format("Mouth-watering %s for only %.2f%n", type.getDisplayName(), type.getPrice());
    }
}
