package com.company.designpatterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Item item1 = new Item("Item1",50);
        Item item2 = new Item("Item2",80);
        Item item3 = new Item("Item3",100);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
        shoppingCart.removeItem(item1);

        PaymentStrategy paymentStrategy = new PaypalStrategy("mustafa@mail.com","1234");
        shoppingCart.pay(paymentStrategy);
    }

}
