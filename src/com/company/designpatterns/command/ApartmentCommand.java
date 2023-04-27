package com.company.designpatterns.command;

import com.company.designpatterns.builder.Home;
import com.company.designpatterns.factory.ApartmentFactory;
import com.company.designpatterns.factory.HomeFactory;

public class ApartmentCommand implements HomeCommand{

    private final HomeFactory homeFactory = new ApartmentFactory();
    @Override
    public Home execute() {
        return homeFactory.createHome();
    }
}
