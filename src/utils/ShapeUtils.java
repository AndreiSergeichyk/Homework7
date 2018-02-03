package utils;

import abstraction.Figure;
import implementation.Rectangle;
import implementation.Triangle;

final public class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isTriangle(Figure figure){
        return figure instanceof Triangle;
    }

    public static boolean isRectangle(Figure figure){
        return figure instanceof Rectangle;
    }
}
