package com.company.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Subject{
    List<String> jobs;
    List<Observer> jobSeekers;

    public HeadHunter() {
        jobs= new ArrayList<>();
        jobSeekers= new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        jobSeekers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        jobSeekers.remove(observer);
    }

    @Override
    public void nofityAllObservers(String job) {
        for(Observer observer:jobSeekers){
            observer.update(job);
        }

    }

    public void addJob(String job){
        this.jobs.add(job);
        nofityAllObservers(job);
    }

    public List<String> getJobs(){
        return this.jobs;
    }

}
