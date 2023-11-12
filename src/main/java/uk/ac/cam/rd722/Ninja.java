package uk.ac.cam.rd722;

public class Ninja implements NinjaInterface {
    private double ninjaSkill;
    public boolean infiltrate() {
        return NinjaInterface.infiltrate(ninjaSkill);
    }
    public double assassinate() {
        return NinjaInterface.assassinate(ninjaSkill);
    }

    Ninja(double ninjaSkill) {
        this.ninjaSkill = ninjaSkill;
    }
}
