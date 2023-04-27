package com.company.designpatterns.command;

import com.company.designpatterns.builder.Home;
import com.company.designpatterns.factory.HomeFactory;
import com.company.designpatterns.factory.HomeWithGarageFactory;

public class HomeWithGarageCommand implements HomeCommand{

    private final HomeFactory homeFactory = new HomeWithGarageFactory();
    @Override
    public Home execute() {
        return this.homeFactory.createHome();
    }
}
