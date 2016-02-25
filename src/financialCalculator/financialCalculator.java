/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gavin Christie, Carter Ford and Jordan Hurley (Sort of)
 */
public class financialCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Greetings! Which type of finance can I help you with today?");
        System.out.print("\n   Mortgage - 1\n   Interest - 2\n   Value - 3\n");
        int decision = input.nextInt();
        if (decision == 1) {
            System.out.print("Loan amount: ");
            double loanAmount = input.nextDouble();
            System.out.print("Number of payments per year: ");
            int num = input.nextInt();
            System.out.print("Number of years to repay loan: ");
            int term = input.nextInt();
            System.out.print("Fixed interest rate: ");
            double rate = input.nextDouble();
            
            DecimalFormat df = new DecimalFormat("#.##");
            
            System.out.print("Your monthly payment is, " 
                    + df.format(mortgage(loanAmount, num, term, rate)) + "\n");
        } else if (decision == 2) {
            System.out.print("\nWhat type of Interest?\n   Simple - 1\n   Compound - 2\n");
            int typeOfInter = input.nextInt();
            if (typeOfInter == 1) {
                System.out.println("Please enter Principal Amount, Interest Rate, and the Number of Years");
                double princiAmt = input.nextDouble();
                double rate = input.nextDouble();
                double numOfYears = input.nextDouble();
                System.out.println(simpleInterest(princiAmt, rate, numOfYears));
            } else if (typeOfInter == 2) {
                System.out.println("Please enter Principal Amount, Interest Rate, Number Of Times Compunded, and the Number of Years");
                double princiAmt = input.nextDouble();
                double rate = input.nextDouble();
                double numOfComp = input.nextDouble();
                double numOfYears = input.nextDouble();
                System.out.println(compoundInterest(princiAmt, rate, numOfComp, numOfYears));
            }
        } else if (decision == 3) {
            System.out.println("Would you like to determine future or present value? ");
            String answer = input.nextLine();
            answer = answer.toUpperCase();
            if(answer.equals("FUTURE")){
                System.out.println("Thank you for selecting the future value calculator."
                                        + " Please enter your present value. ");
                double presentValue = input.nextDouble();
                System.out.println("Please enter your interest rate. ");
                double interestRate = input.nextDouble();
                System.out.println("Finally enter the desired time period. ");
                double numberOfYears = input.nextDouble();
                System.out.println("Your future value is" 
                        + df.format(futureValue(presentValue, interestRate, numberOfYears)));
            }
        }
    }
        /**
     * Calculates the final pay out for simple and compound interest
     *
     * @param princiAmt The total amount to start with
     * @param rate The interest rate
     * @param numOfYears The number of years the interest takes affect
     * @param numOfCompound The number of times the amount is compounded
     * @return  This returns the final amount
     */
    public static double simpleInterest(double princiAmt, double rate, double numOfYears) {
        double ammt = 0;
        rate = rate / 100;
        ammt = (princiAmt * (1 + (rate * numOfYears)));
        return ammt;
    }

    public static double compoundInterest(double princiAmt, double rate, double numOfComp, double numOfYears) {
        double ammt = 0;
        rate = rate / 100;
        ammt = (princiAmt * (1 + (rate / numOfComp)));
        ammt = Math.pow(ammt, (numOfComp * numOfYears));
        return ammt;
    }

    /**
     * Calculates the total payment value for a fixed rate mortgage
     *
     * @param loanAmount The amount being borrowed by the user
     * @param numPayments The number of payments per year
     * @param loanTerm The number of years over which the money will be repaid
     * @param rate The annual interest rate
     * @return This returns the monthly payment value
     */
    public static double mortgage(double loanAmount, int numPayments, int loanTerm, double rate) {
        double payment;
        double r = (rate / 12) / 100;
        double tPN = loanTerm * numPayments;

        payment = (r / (1 - Math.pow((1 + r), -tPN))) * loanAmount;

        return payment;
    }

    /**
     * Calculate what the user's future value will be based on their present value, 
     *                  the interest and the number of years that will pass
     * @param presentValue The amount the user started with
     * @param interestRate The interest rate the user will receive on top of their present value
     * @param numberOfYears  The number of years that will pass in order to receive the future value
     * @return This returns the future value
     */
    public static double futureValue(double presentValue, double interestRate, double numberOfYears) {
        double FV = presentValue * Math.pow((1 + interestRate), numberOfYears);
        return FV;
    }
}
