package com.company.designpatterns.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void nofityAllObservers(String string);

}
