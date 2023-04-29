package com.company.designpatterns.strategy;

public class Item {
    private String uppCode;
    private int price;

    public Item(String uppCode, int price) {
        this.uppCode = uppCode;
        this.price = price;
    }

    public String getUppCode() {
        return uppCode;
    }

    public int getPrice() {
        return price;
    }
}
