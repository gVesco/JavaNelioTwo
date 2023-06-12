package Exerc0803.application;

import java.util.Locale;
import java.util.Scanner;

import Exerc0803.entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();
        
        System.out.println("Insert the name of student and his/her grades.");
        System.out.print("Name: ");
        student.setName(scn.nextLine());
        System.out.print("Grade 1: ");
        student.grade1 = scn.nextDouble();
        System.out.print("Grade 2: ");
        student.grade2 = scn.nextDouble();
        System.out.print("Grade 3: ");
        student.grade3 = scn.nextDouble();
        
        System.out.println("FINAL GRADE = " + student.finalGrade());
        // Confere e imprime na tela se o aluno passou no teste
        System.out.print(student.checkMissingPoints());

        scn.close();
    }
}
