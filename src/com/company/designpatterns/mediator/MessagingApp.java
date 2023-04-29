package com.company.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MessagingApp implements Mediator{

    private List<Student> students;

    public MessagingApp(){
        students = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Student sender) {
        for (Student student : students) {
            if (student != sender) {
                student.receiveMessage(message);
            }
        }
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
}
