package implementation;

import abstraction.Figure;

public class Circle extends Figure {
    private double firstRadius;

    public Circle(String figureType, double radius) {
        super(figureType);
        this.firstRadius = radius;
    }

    public double getFirstRadius() {
        return firstRadius;
    }

    public void setFirstRadius(double firstRadius) {
        this.firstRadius = firstRadius;
    }

    public double getDiameter() {
        return 2 * firstRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(firstRadius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "firstRadius=" + firstRadius +
                '}';
    }
}
