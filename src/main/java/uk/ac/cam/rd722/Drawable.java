// Drawable.java

package uk.ac.cam.rd722;

// a class implementing Drawable must have implementations of both methods here before it can be instanced
public interface Drawable {
    public double[][] draw(int x, int y, int width, int height);
    public String getName();
}
