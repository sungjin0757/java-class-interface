package item23;

public class Figure {
    enum Shape {RECTANGLE, CIRCLE};

    //태그
    final Shape shape;

    // Rectangle 일 때만 사용
    double length;
    double width;

    // Circle 일 때만 사용
    double radius;

    public Figure(double radius) {
        this.radius=radius;
        shape=Shape.CIRCLE;
    }

    public Figure(double length, double width) {
        this.length = length;
        this.width = width;
        shape=Shape.RECTANGLE;
    }

    double area(){
        switch (shape){
            case CIRCLE:
                return Math.PI*Math.pow(radius,2);
            case RECTANGLE:
                return length*width;
            default:
                throw new AssertionError(shape);
        }
    }
}
