package com.company.designpatterns.builder;

public class Home {
    private boolean wall;
    private boolean doors;
    private boolean garage;
    private boolean garden;
    private boolean childRoom;

    public Home(){}

    public Home(boolean wall, boolean doors, boolean garage, boolean garden, boolean childRoom){
        this.wall = wall;
        this.doors = doors;
        this.garage = garage;
        this.garden = garden;
        this.childRoom = childRoom;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isChildRoom() {
        return childRoom;
    }

    public void setChildRoom(boolean childRoom) {
        this.childRoom = childRoom;
    }

    @Override
    public String toString() {
        return "Home{" +
                "wall=" + wall +
                ", doors=" + doors +
                ", garage=" + garage +
                ", garden=" + garden +
                ", childRoom=" + childRoom +
                '}';
    }
}
