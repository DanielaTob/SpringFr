package com.example.demo;

public class Square implements Shape{

    private Point sides;

    @Override
    public void draw() {
        System.out.println("Drawing Square...");
        System.out.println("Square: Sides are: (" + sides.getX() + ", " + sides.getY() + ")");
    }

    public Point getSides() {
        return sides;
    }

    public void setSides(Point sides) {
        this.sides = sides;
    }
}
