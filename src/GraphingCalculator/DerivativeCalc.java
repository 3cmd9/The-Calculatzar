/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphingCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author 068684570
 */
public class DerivativeCalc {
    
    public final static int input = 4;
    public final static int length = input + 1;
    public final static int x = 4;
    public final static int y = 4;
    public static double c = 0;
    public static double [] coeff = new double[length];
    public static double[] exp = new double[length];
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int expamount = 4;
        System.out.print("BASE: ");
        for (int i = 0; i < length; i++){
            coeff[i] = 1;
            exp[i] = expamount;
            expamount--;
            System.out.print(coeff[i] + "x" + "^" + exp[i] + " ");
        }
        integralD();
    }
    
    public static void coefficientD(){
        for (int j = 0; j < length; j++){
            exp[j] --;
            coeff[j] *= exp[j];
            System.out.print(round(coeff[j]) + "x" + "^" + round(exp[j]) + " ");
        }
    }
    
    public static void integralD(){
        System.out.print("INTEGRAL: ");
        for (int q = 0; q < length; q++){
            exp[q] ++;
            coeff[q] /= exp[q];
            System.out.print(round(coeff[q]) + "x" + "^" + round(exp[q]) + " ");
            c -= (coeff[q]*Math.pow(x,(exp[q])));
        }
        c += y;
        System.out.print(round(c));
    }
    
    public static double round(double value) {
		//Rounds a double to 2 decimal places
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
    }
}
