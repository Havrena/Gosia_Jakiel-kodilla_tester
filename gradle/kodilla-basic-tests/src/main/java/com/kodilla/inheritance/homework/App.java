package com.kodilla.inheritance.homework;

public class App {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1956);
        operatingSystem.turnOn();

        Windows10 windows10 = new Windows10(2015);
        windows10.displayYear();

        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.displayYear();

        operatingSystem.turnOff();
    }
}