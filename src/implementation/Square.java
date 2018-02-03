package implementation;

public class Square extends Rectangle {

    public Square(String figureType, double firstSide) {
        super(figureType, firstSide, firstSide);
    }

    public double getPerimetre() {
        return 4 * super.getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + super.getWidth() +
                ", height=" + super.getHeight() +
                '}';
    }
}
