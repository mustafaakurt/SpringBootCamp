package com.company.designpatterns.factory;

import com.company.designpatterns.builder.Home;
import com.company.designpatterns.builder.HomeBuilder;

public class HomeWithGardenFactory extends HomeFactory{


    @Override
    public Home createHome() {
        return createHomeBuilder().addGarden().getResult();
    }
}
