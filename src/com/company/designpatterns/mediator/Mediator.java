package com.company.designpatterns.mediator;

public interface Mediator {
    void sendMessage(String message, Student student);
    void addStudent(Student student);
}
