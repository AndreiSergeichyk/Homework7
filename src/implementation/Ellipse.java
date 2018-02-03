package implementation;

public class Ellipse extends Circle {
    private double seconRadius;

    public Ellipse(String figureTypes, double radius, double seconRadius) {
        super(figureTypes, radius);
        this.seconRadius = seconRadius;
    }

    public double getSeconRadius() {
        return seconRadius;
    }

    public void setSeconRadius(double seconRadius) {
        this.seconRadius = seconRadius;
    }

    public double elongation() {
        return Math.abs(super.getFirstRadius() - seconRadius);
    }

    @Override
    public double getArea() {
        return Math.PI * super.getFirstRadius() / 2 * seconRadius / 2;
    }

    @Override
    public double getDiameter() {
        return seconRadius * 2;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "firstRadius=" + super.getFirstRadius() +
                ", seconRadius=" + seconRadius +
                '}';
    }
}
