package com.itacademy.java.oop.basics;

public class ShapeApplication {

    public static void main(String[] args) {

        Square[] squares = new Square[4];
        squares[0] = new Square(2.5, 2.55);
        squares[1] = new Square(20, -20.78);
        squares[2] = new Square(1, 560);
        squares[3] = new Square(-10, 1);

        for (Square square : squares) {
            if ((square.getLength() <= 0) || (square.getWidth() <= 0)) {
                System.out.println("Square parameters are invalid: length: " + square.getLength() + ", width: " + square.getWidth());
            } else {
                System.out.println(square.toString());
            }

        }

    }

}
