package uk.ac.cam.rd722;

public class Employee {
    protected double hourlyPay;
    private String name;
    public double getPay(double hoursWorked) {
        return hourlyPay * hoursWorked;
    }

    public String getName() {
        return name;
    }

    Employee(String name, double hourlyPay) {
        this.name = name;
        this.hourlyPay = hourlyPay;
    }
}
