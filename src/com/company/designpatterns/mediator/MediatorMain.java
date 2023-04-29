package com.company.designpatterns.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        Mediator messagingApp = new MessagingApp();

        Student onSiteStudentA = new OnSiteStudent(messagingApp);
        Student onSiteStudentB = new OnSiteStudent(messagingApp);
        Student remoteStudentA = new RemoteStudent(messagingApp);

        messagingApp.addStudent(onSiteStudentA);
        messagingApp.addStudent(onSiteStudentB);
        messagingApp.addStudent(remoteStudentA);

        onSiteStudentA.sendMessage("Hi remote, how is it going?");
        remoteStudentA.sendMessage("Hi, great. I have lots of things to do, how about you?");
    }
}
