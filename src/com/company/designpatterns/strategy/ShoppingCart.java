package com.company.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
        System.out.println("Item " + item.getUppCode() + " added.");
    }
    public void removeItem(Item item){
        items.remove(item);
        System.out.println("Item " + item.getUppCode() + " removed.");
    }
    public int calculateTotal(){
        int totalPrice = 0;
        for (Item item:items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public void pay (PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
