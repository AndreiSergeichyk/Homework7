package abstraction;

public abstract class Figure implements Area {
    public static final String RECTANGLE = "Rectangle";
    public static final String SQUARE = "Square";
    public static final String ELLIPSE = "Ellipse";
    public static final String CIRCLE = "Circle";
    public static final String TRIANGLE = "Triangle";
    public static final String RECTANGULAR_TRIANGLE = "Rectangular triangle";

    private String figureType;

    public Figure(String figureType) {
        this.figureType = figureType;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public boolean isEqualsAreaFigires(Figure figure) {
        return this.getArea() == figure.getArea();
    }

}
