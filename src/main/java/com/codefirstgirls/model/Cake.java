package com.codefirstgirls.model;

public class Cake extends BakeryItem{

    private String customNote;

    public Cake(Type type) {
        super(type);
    }

    public void setCustomNote(String customNote) {
        this.customNote = customNote;
    }

    public String getCustomNote() {
        return this.customNote;
    }

    @Override
    public String displayItem() {
        return String.format("Delicious %s (%.2f)%n", type.getDisplayName(), type.getPrice());
    }
}
