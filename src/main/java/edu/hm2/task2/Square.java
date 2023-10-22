package edu.hm2.task2;

public final class Square extends Rectangle {

    final private int side;

    public Square() {
        side = 0;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public Rectangle setWidth(int side) {
        return new Rectangle(side, this.side);
    }

    @Override
    public Rectangle setHeight(int side) {
        return new Rectangle(this.side, side);
    }
}
