package com.company.designpatterns.mediator;

public class OnSiteStudent extends Student {
    public OnSiteStudent(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("On-site student received message: " + message);
    }

}
