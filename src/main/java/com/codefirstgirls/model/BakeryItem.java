package com.codefirstgirls.model;

import lombok.Getter;

public abstract class BakeryItem {

    @Getter
    public final Type type;

    public BakeryItem(Type type) {
        this.type = type;
    }

    public abstract String displayItem();

}
