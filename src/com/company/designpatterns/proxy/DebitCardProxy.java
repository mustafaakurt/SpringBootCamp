package com.company.designpatterns.proxy;

public class DebitCardProxy implements BankAccount{

    private SavingAccount savingAccount;

    public DebitCardProxy(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    @Override
    public void debit(double amount) {
            savingAccount.debit(amount);
    }

}
