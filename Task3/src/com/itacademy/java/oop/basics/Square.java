package com.itacademy.java.oop.basics;

public class Square {

    private double length;
    private double width;

    public Square() {

    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + calculatePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }
}
