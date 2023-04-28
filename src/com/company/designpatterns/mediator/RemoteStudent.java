package com.company.designpatterns.mediator;

public class RemoteStudent extends Student {
    public RemoteStudent(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Remote student received message: " + message);
    }
}
