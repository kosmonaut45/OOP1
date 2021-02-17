package com.itacademy.java.oop.basics;

public class PointApplication {

    public static void main(String[] args) {
        MyPoint firstPoint = new MyPoint(3, 4);
        MyPoint secondPoint = new MyPoint(7, 9);


        System.out.println("Distance between point (0, 0) and point " + firstPoint.toString() + " is = " + firstPoint.distance());
        firstPoint.setX(1);
        firstPoint.setY(1);
        System.out.println("Distance between point " + firstPoint.toString() + "and point " + secondPoint.toString() + " is = " + firstPoint.distance(secondPoint));
        secondPoint.setXY(2, 2);
        System.out.println("Distance between point " + secondPoint.toString() + "and point (14, 18) is = " + secondPoint.distance(14, 18));

        System.out.println("First point coordinates are: ");
        for (int i = 0; i < firstPoint.getXY().length; i++) {
            System.out.println(firstPoint.getXY()[i]);
        }

        System.out.println("First point coordinates are: ");
        System.out.println(secondPoint.getX());
        System.out.println(secondPoint.getY());
    }

}
