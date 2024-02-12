package mortgagecalculator;


import java.util.InputMismatchException;
import java.util.Scanner;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CalculatorMethodsClass {
    protected int principal;
    protected float monthlyInterest;
    protected int numberOfPayments;

    protected final byte MONTHS_IN_YEAR = 12;
    protected final byte PERCENT = 100;

    protected Scanner scanner = new Scanner(System.in);




    public void getPrincipal() {
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
    }

    public void getAnnualInterestRate() {
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
    }

    public void getNumberOfYears() {
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
    }

    public void calculate(){

    }
   
}
