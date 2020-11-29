package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(3);
    }
    double height = 6;
    double sideB = 5;
    double sideC = 4;

    @Override
    public void showArea() {
        area = sideA * height * 0.5;
        System.out.println("The area of this triangle is " + area + " sq cm");
    }

    @Override
    public void showPerimeter() {
        perimeter = sideA + sideB + sideC;
        System.out.println("The perimeter of this triangle is " + perimeter + " cm");
    }
}