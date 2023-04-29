package com.company.designpatterns.proxy;

public class SavingAccount implements BankAccount{
    private double balance;

    public SavingAccount(double initalBalance) {
        this.balance = initalBalance;
    }

    @Override
    public void debit(double amount) {
        if(validate(amount)){
            balance -= amount;
            System.out.println(""+amount + "$ has been debited. New balance: " + balance);
        }else if (!validate(amount)){
            System.out.println("Insuficiant Balance");
        }

    }

    public boolean validate(double amount){
        return balance >= amount;
    }
}
