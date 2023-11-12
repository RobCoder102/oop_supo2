// Circle.java

package uk.ac.cam.rd722;

// Circle must implement every abstract method from Shape and every method from Drawable not already implemented by Shape
public class Circle extends Shape {
    private double radius;
    Circle(double x, double y, double r) {
        posX = x;
        posY = y;
        radius = r;
    }

    // must implement this method from abstract class Shape
    boolean pointInShape(double x, double y) {
        return Math.sqrt(Math.pow(x-posX, 2) + Math.pow(y-posY, 2)) <= radius;
    }

    // must implement this method from abstract class Shape
    void scale(double factor) {
        radius *= factor;
    }

    // must implement this method from interface Drawable
    public String getName() {
        return "Sphere, radius " + radius;
    }
}
