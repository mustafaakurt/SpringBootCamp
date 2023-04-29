package com.company.designpatterns.observer;

import java.util.List;

public class ObserverMain {
    public static void main(String[] args) {
        JobSeeker jobSeeker = new JobSeeker("Mustafa");
        JobSeeker jobSeeker1 = new JobSeeker("Mahmut");
        HeadHunter headHunter = new HeadHunter();

        headHunter.registerObserver(jobSeeker);
        headHunter.registerObserver(jobSeeker1);
        headHunter.addJob("Java developer");
        headHunter.addJob(".net developer");
        headHunter.addJob("Salesforce developer");

        headHunter.nofityAllObservers("Java developer");
        List<String> jobList = headHunter.getJobs();
        for (String jobs:jobList) {
            System.out.println(jobs);
        }


    }
}
