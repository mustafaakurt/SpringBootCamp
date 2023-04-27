package com.company.designpatterns.command;

import com.company.designpatterns.builder.Home;

import java.util.HashMap;
import java.util.Map;

public class CommandMain {

    Map<HomeCommandType,HomeCommand> homeCommandMap = new HashMap<>();

    public CommandMain() {
        homeCommandMap.put(HomeCommandType.CREATE_HOME_WITH_GARAGE,new HomeWithGarageCommand());
        homeCommandMap.put(HomeCommandType.CREATE_HOME_WITH_GARDEN,new HomeWithGardenCommand());
        homeCommandMap.put(HomeCommandType.CREATE_APARTMENT,new ApartmentCommand());
    }

    public Home main(HomeCommandType homeCommandType){
        return homeCommandMap.get(homeCommandType).execute();
    }

}
