package Exerc0803.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String checkMissingPoints() {
        if (finalGrade() >= 60) {
            return String.format("PASS");
        }
        else {
            return String.format("FAILED%nMISSING " + Math.abs(finalGrade() - 60) + " POINTS");
        }

    }


}
