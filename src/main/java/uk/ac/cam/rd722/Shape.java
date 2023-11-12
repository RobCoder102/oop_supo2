// Shape.java

package uk.ac.cam.rd722;

// does not have to implement every method from Drawable as this class can't be instanced anyway
abstract public class Shape implements Drawable {
    // fields that subclasses will inherit as per usual
    protected double posX;
    protected double posY;

    // defines methods that subclasses must implement
    abstract boolean pointInShape(double x, double y);
    abstract void scale(double factor);

    // implements method from Drawable, so Circle doesn't need to
    // abstract classes can still have behaviour, this is an example
    public double[][] draw(int x, int y, int width, int height) {
        double[][] img = new double[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (pointInShape(x + i, y + j)) {
                    img[j][i] = 1.0;
                } else {
                    img[j][i] = 0.0;
                }
            }
        }
        return img;
    }
}
