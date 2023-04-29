package com.company.designpatterns.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);
        DebitCardProxy debitCardProxy = new DebitCardProxy(savingAccount);

        debitCardProxy.debit(100);
        debitCardProxy.debit(100000);
        debitCardProxy.debit(10);

    }
}
