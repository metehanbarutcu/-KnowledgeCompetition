package com.h5190019.ibrahim_metehan_barutcu.model;

public class Player {

    String name = "";
    int point = 0;

    public Player() {
    }

    public Player(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }


    public int getPuan() {
        return point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPuan(int point) {
        this.point = point;
    }
}
