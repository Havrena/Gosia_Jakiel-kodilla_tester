package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(5);
    }

    @Override
    public void showArea() {
        area = sideA * sideA;
        System.out.println("The area of this square is " + area + " sq cm");
    }

    @Override
    public void showPerimeter() {
        perimeter = 4 * sideA;
        System.out.println("The perimeter of this square is " + perimeter + " cm");
    }

}