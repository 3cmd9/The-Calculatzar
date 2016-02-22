/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialCalculator;

/**
 *
 * @author Gavin Christie
 */
public class financialCalculator {
   
    /**
     * Calculates the total payment value for a fixed rate mortgage
     * @param loanAmount  The amount being borrowed by the user
     * @param numPayments The number of payments per year
     * @param loanTerm    The number of years over which the money will be repaid
     * @param rate        The annual interest rate
     * @return 
     */
    public static double mortgage(double loanAmount, int numPayments, int loanTerm, double rate) {
        double payment;
        double r = (rate/12)/100;
        double tPN = loanTerm*numPayments;
        
        payment = (r/(1-Math.pow((1+r), -tPN)))*loanAmount;
        
        return payment;
    }
}