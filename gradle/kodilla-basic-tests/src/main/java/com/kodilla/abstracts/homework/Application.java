package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.showArea();
        square.showPerimeter();

        Triangle triangle = new Triangle();
        triangle.showArea();
        triangle.showPerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.showArea();
        rectangle.showPerimeter();
    }
}