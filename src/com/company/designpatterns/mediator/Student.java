package com.company.designpatterns.mediator;

public abstract class Student {
    protected Mediator mediator;

    public Student(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
