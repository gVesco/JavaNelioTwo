package Exerc0802.application;

import java.util.Locale;
import java.util.Scanner;

import Exerc0802.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.println("Insert employee data.");
        System.out.print("Name: ");
        employee.setName(scn.nextLine());
        System.out.print("Gross salary: ");
        employee.setGrossSalary(scn.nextDouble());
        System.out.print("Tax: ");
        employee.setTax(scn.nextDouble());

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = scn.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        scn.close();
    }
}
