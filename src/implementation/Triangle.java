package implementation;

import abstraction.Figure;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String figureType, double sideA, double sideB, double sideC) {
        super(figureType);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    private double getProperiter() {
        return (sideA + sideB + sideC) / 2;
    }

    public double getH() {
        return 2 * getArea() / sideC;
    }

    @Override
    public double getArea() {
        double p = getProperiter();

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
