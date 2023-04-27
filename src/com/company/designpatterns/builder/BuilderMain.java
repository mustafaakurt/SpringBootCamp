package com.company.designpatterns.builder;

public class BuilderMain {

    private static HomeBuilder homeBuilder;
    private static Home home;

    public static void main(String[] args) {
        homeBuilder = new HomeBuilder();
        home = homeBuilder.addDoor().addWall().addChildRoom().getResult();
        System.out.println(home);
    }
}
