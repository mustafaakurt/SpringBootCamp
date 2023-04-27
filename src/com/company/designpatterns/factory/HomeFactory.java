package com.company.designpatterns.factory;

import com.company.designpatterns.builder.Builder;
import com.company.designpatterns.builder.Home;
import com.company.designpatterns.builder.HomeBuilder;

public abstract class HomeFactory {
    HomeBuilder HOME_BUILDER = new HomeBuilder();

    Builder<Home> createHomeBuilder(){
        return HOME_BUILDER.addWall().addDoor();
    }

    public abstract Home createHome();
}
