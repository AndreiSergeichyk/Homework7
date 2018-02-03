package implementation;

import abstraction.Figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String figureType, double width, double height) {
        super(figureType);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
