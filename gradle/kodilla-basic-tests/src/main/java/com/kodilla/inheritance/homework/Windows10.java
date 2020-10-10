package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {
    public Windows10(int year) {
        super(year);
    }
    @Override
    public void displayYear() {
        System.out.println("Windows XP - " + "Year of production: " + year);
    }
}