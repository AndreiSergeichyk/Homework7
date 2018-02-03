package start;

import abstraction.Figure;
import implementation.*;
import utils.ShapeUtils;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(Figure.CIRCLE, 4);
        Figure ellipse = new Ellipse(Figure.ELLIPSE, 5, 3);
        Figure square = new Square(Figure.SQUARE, 5);
        Figure rectangle = new Rectangle(Figure.RECTANGLE, 5, 6);
        Figure triangle = new Triangle(Figure.TRIANGLE, 5, 5, 3);
        Figure rectangularTriangle = new RectangularTriangle(Figure.RECTANGULAR_TRIANGLE, 4, 3, 5);

        Figure[] figureArray = {circle, ellipse, square, rectangle, triangle, rectangularTriangle};

        for (Figure figure : figureArray) {
            print(figure, ellipse);
        }
    }

    private static void print(Figure ellipse, Figure figure) {
        System.out.println(figure.toString());
        System.out.printf("площадь: %.2f\n", figure.getArea());
        System.out.println(figure.isEqualsAreaFigires(ellipse) ? "площади равны" : "площади не равны");
        System.out.println(ShapeUtils.isRectangle(figure) ? "является прямоугольником" : "не является прямоугольником");
        System.out.println(ShapeUtils.isTriangle(figure) ? "является треугольником" : "не является треугольником");

        if (figure instanceof Ellipse) {
            System.out.printf("вытянутость: %.2f\n", ((Ellipse) figure).elongation());
        } else if (figure instanceof Circle) {
            System.out.printf("диаметр: %.2f\n", ((Circle) figure).getDiameter());
        } else if (figure instanceof Square) {
            System.out.printf("периметр: %.2f\n", ((Square) figure).getPerimetre());
        } else if (figure instanceof Rectangle) {
            System.out.printf("диагональ: %.2f\n", ((Rectangle) figure).getDiagonal());
        } else if (figure instanceof RectangularTriangle) {
            System.out.printf("синус альфа: %.2f\n", ((RectangularTriangle) figure).sinAlpha());
        } else if (figure instanceof Triangle) {
            System.out.printf("высота: %.2f\n", ((Triangle) figure).getH());
        } else {
            System.out.println("нет такого типа фигур");
        }
        System.out.println();
    }
}
