package implementation;

public class RectangularTriangle extends Triangle {

    public RectangularTriangle(String figureType, double firstSide, double secondSide, double thirdSide) {
        super(figureType, firstSide, secondSide, thirdSide);
    }

    public double sinAlpha() {
        return super.getSideA() / super.getSideB();
    }

    @Override
    public String toString() {
        return "RectangularTriangle{" +
                "sideA=" + super.getSideA() +
                ", sideB=" + super.getSideB() +
                ", sideC=" + super.getSideC() +
                '}';
    }
}
