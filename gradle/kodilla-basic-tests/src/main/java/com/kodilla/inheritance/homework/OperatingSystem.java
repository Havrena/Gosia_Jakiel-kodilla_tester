package com.kodilla.inheritance.homework;
public class OperatingSystem {
    public int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Device was turned on");
    }

    public void turnOff() {
        System.out.println("Device was turned off");
    }

    public int getYear() {
        return year;
    }

    public void displayYear() {
        System.out.println("Operating system - " + "Year of production: " + year);
    }
}