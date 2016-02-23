/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialCalculator;

import java.util.Scanner;

/**
 *
 * @author Gavin Christie, Carter Ford & Jordan Hurley (Sort of)
 */
public class financialCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Greetings! Which type of finance can I help you with today?");
        System.out.print("\n   Mortgage - 1\n   Interest - 2\n   No Idea - 3");
        int decision = input.nextInt();
        if (decision == 1) {
            System.out.print("\nWhat type of Mortgage?\nLoan Amount - "); //INPUT TYPE OF CALCULATION
            System.out.println("Please input -"); //INPUT REQUIRED INFORMATION
            //all the data here...

        } else if (decision == 2) {
            System.out.print("\nWhat type of Interest?\n   Simple - 1\n   Compound - 2");
            int typeOfInter = input.nextInt();
            if (typeOfInter == 1) {
                System.out.println("Please enter Principal Amount, Interest Rate, and the Number of Years");
                double princiAmt = input.nextDouble();
                double rate = input.nextDouble();
                double numOfYears = input.nextDouble();
                System.out.println(simpleInterest(princiAmt, rate, numOfYears));
            } else if (typeOfInter == 2){
                System.out.println("Please enter Principal Amount, Interest Rate, Number Of Times Compunded, and the Number of Years");
                double princiAmt = input.nextDouble();
                double rate = input.nextDouble();
            }
        }
    }

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
     * @return
     */
    public static double mortgage(double loanAmount, int numPayments, int loanTerm, double rate) {
        double payment;
        double r = (rate / 12) / 100;
        double tPN = loanTerm * numPayments;

        payment = (r / (1 - Math.pow((1 + r), -tPN))) * loanAmount;

        return payment;
    }
}


