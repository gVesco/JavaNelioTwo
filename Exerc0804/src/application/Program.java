package application;

// import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price? ");
        double dollarPrice = scn.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarAmount = scn.nextDouble();

        double dollarFinal = CurrencyConverter.dollarToReal(dollarPrice, dollarAmount);
        System.out.printf("Amount to be paid in reais = %.2f", dollarFinal);

        scn.close();
    }
}
