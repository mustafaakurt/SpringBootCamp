package com.company.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MessagingApp implements Mediator{

    private List<Colleague> colleagues;

    public MessagingApp(){
        colleagues = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
}
