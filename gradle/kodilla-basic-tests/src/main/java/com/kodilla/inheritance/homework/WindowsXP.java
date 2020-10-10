package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {

    public WindowsXP(int year) {
        super(year);
    }
    @Override
    public void displayYear() {
        System.out.println("Windows 10 - " + "Year of production: " + year);
    }
}
