package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4);
    }
    double sideB = 5;

    @Override
    public void showArea() {
        area = sideB * sideA;
        System.out.println("The area of this rectangle is " + area + " sq cm");
    }

    @Override
    public void showPerimeter() {
        perimeter = 2 * sideA + 2 * sideB;
        System.out.println("The perimeter of this rectangle is " + perimeter + " cm");
    }
}