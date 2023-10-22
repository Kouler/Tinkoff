package edu.hm2.task2;

public sealed class Rectangle permits Square {

    final private int width;
    final private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return width * height;
    }

    public Rectangle setWidth(int width) {
        return new Rectangle(width, this.height);
    }

    public Rectangle setHeight(int height) {
        return new Rectangle(this.width, height);
    }
}
