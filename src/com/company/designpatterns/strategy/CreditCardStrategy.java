package com.company.designpatterns.strategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpriy;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpriy) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpriy = dateOfExpriy;
    }

    @Override
    public void pay(int amount) {
        System.out.println("" + amount + "$ paid with Credit Card");
    }

}
