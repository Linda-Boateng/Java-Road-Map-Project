package mortgagecalculator;

import java.text.NumberFormat;

public class CalculatorClass extends CalculatorMethodsClass{

    public static void main(String[] args) {
        CalculatorClass calculator = new CalculatorClass();
        calculator.getPrincipal();
        calculator.getAnnualInterestRate();
        calculator.getNumberOfYears();
        calculator.calculate();

}
@Override
    public  void calculate(){
    double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage:" + mortgageFormatted);
}
}
