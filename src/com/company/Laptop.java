package com.company;

public class Laptop {
    String name;
    String model;

    public Laptop(String name, String model) {
        this.name = name;
        this.model = model;


    }

    public void runningApps() {
        System.out.println("your wish is my command");

    }

    public String getModel() {
        return this.model;
    }

    public int speedingUp(int currentRam) {
        currentRam += 2048;
        return currentRam;

    }

}
