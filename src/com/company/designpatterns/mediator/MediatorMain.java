package com.company.designpatterns.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        Mediator messagingApp = new MessagingApp();

        Colleague onSiteStudentA = new OnSiteStudent(messagingApp);
        Colleague onSiteStudentB = new OnSiteStudent(messagingApp);
        Colleague remoteStudentA = new RemoteStudent(messagingApp);

        messagingApp.addColleague(onSiteStudentA);
        messagingApp.addColleague(onSiteStudentB);
        messagingApp.addColleague(remoteStudentA);

        onSiteStudentA.sendMessage("Hi remote, how is it going?");
        remoteStudentA.sendMessage("Hi, great. I have lots of things to do, how about you?");
    }
}
