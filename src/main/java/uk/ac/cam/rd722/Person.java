package uk.ac.cam.rd722;

public class Person {
    private String forename;
    private String surname;

    // one version
    /*public String toString() {
        return "Forename: " + forename + " Surname: " + surname;
    }*/

    // another version
    public String toString() {
        return "Name: " + forename + " " + surname;
    }

    Person(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    public static void testOutput() {
        Person p = new Person("Joe", "Bloggs");
        System.out.println("Person details: " + p);
    }

    public static void main(String[] args) {
        testOutput();
    }

}
