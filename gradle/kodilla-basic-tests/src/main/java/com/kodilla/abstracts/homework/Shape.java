package com.kodilla.abstracts.homework;

public abstract class Shape {
    public double area;
    public double perimeter;
    public double sideA;

    public Shape(double sideA) {
        this.sideA = sideA;
    }

    public abstract void showArea();

    public abstract void showPerimeter();
}