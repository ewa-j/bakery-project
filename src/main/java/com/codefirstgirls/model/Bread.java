package com.codefirstgirls.model;

public class Bread extends BakeryItem {

    public Bread(Type type) {
        super(type);
    }

    @Override
    public String displayItem() {
        return String.format("Yummy %s for only %.2f%n", type.getDisplayName(), type.getPrice());
    }
}
