package mortgagecalculator;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Building A Mortgage Calculator Requirement Specs: 1. Principal:100000 2.Annual Interest Rates:4.2
 * 3. Period(Years):30 4. Mortgage:$? 5.
 * CHALLENGE 1
 */
public class MortgageCalculator {

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    int principal = 0;
    float monthlyInterest = 0.0F;
    int numberOfPayments = 0;
    Scanner scanner = new Scanner(System.in);

    // taking input for principal
    while (true) {
      try {
        System.out.println("Principal:");
        principal = scanner.nextInt();
        if (principal > 1000 && principal <= 1_000_000) {
          break;
        } else {
          System.out.println("Enter A Value Between 1000 and 1000000");
        }
      } catch (InputMismatchException e) {
        System.out.println("Enter A Value Between 1000 and 1000000");
        scanner.nextLine();
      }
    }

    // taking input for interest rate
    while (true) {
      try {
        System.out.println("Annual Interest Rate:");
        float annualInterestRate = scanner.nextFloat();
        if (annualInterestRate != 4.2F) {
          System.out.println("Please annual interest rate should be 4.2");
        } else {
          monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Please annual interest rate should be 4.2");
        scanner.nextLine();
      }
    }

    // taking input for number of years
    while (true) {
      try {
        System.out.println("Period(Years):");
        int years = scanner.nextInt();
        if (years < 30) {
          System.out.println("Please enter a valid number of years.");
        } else {
          numberOfPayments = years * MONTHS_IN_YEAR;
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Please enter a valid number of years.");
        scanner.nextLine();
      }
    }

    // calculating mortgage
    double mortgage =
        principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage:" + mortgageFormatted);
  }
}
