package com.company.designpatterns.strategy;

public class PaypalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        if(amount >= 0){
            System.out.println(""+ amount +"$ paid with Paypal");
        }else if (amount <= 0){
            System.out.println("Shopping Cart is empty");
        }

    }
}
