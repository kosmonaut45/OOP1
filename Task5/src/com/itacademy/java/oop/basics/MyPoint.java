package com.itacademy.java.oop.basics;

public class MyPoint {

    int x = 0;
    int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {

        return Math.hypot(this.x - x, this.y - y);

    }

    public double distance(MyPoint another) {

        return Math.hypot(this.x - another.x, this.y - another.y);

    }

    public double distance() {

        return Math.hypot(-this.x, -this.y);

    }
}
