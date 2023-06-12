package Exerc0802.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(Double percentage) {
        grossSalary += grossSalary * percentage / 100 ;
    }

    @Override
    public String toString() {
        return String.format("%n%s%nNew net salary: $ %.2f %n", name, netSalary());
    }

}
