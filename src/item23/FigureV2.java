package item23;

import java.util.HashMap;

public abstract class FigureV2 {
    abstract double area();
}

class Circle extends FigureV2{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }
}

class Rectangle extends FigureV2{
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width*length;
    }
}
