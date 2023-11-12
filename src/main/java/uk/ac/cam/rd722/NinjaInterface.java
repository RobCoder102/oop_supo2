package uk.ac.cam.rd722;

public interface NinjaInterface {
    public boolean infiltrate();
    public double assassinate();
    public static boolean infiltrate(double ability) {
        // infiltration success?
        return ability*Math.random() > 10;
    }

    public static double assassinate(double ability) {
        // time taken to assassinate
        return 100*Math.random()/ability;
    }
}
