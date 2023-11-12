package uk.ac.cam.rd722;

public class NinjaEmployee extends Employee implements NinjaInterface {
    private double ninjaSkill;
    public boolean infiltrate() {
        // better pay, better job
        return NinjaInterface.infiltrate(ninjaSkill*hourlyPay);
    }

    public double assassinate() {
        // better pay, better job
        return NinjaInterface.assassinate(ninjaSkill*hourlyPay);
    }

    NinjaEmployee(String name, double hourlyPay, double ninjaSkill) {
        super(name, hourlyPay);
        this.ninjaSkill = ninjaSkill;
    }
}
