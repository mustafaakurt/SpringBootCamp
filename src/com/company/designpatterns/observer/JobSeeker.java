package com.company.designpatterns.observer;

public class JobSeeker implements Observer{
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(String job) {
        System.out.println(name + " received notification: " + job);
    }
}
