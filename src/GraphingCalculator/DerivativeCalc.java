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
    
    public static int input = 4;
    public static int x = 4;
    public static int y = 4;
    public static double c = 0;
    public static double [] coeff = new double[4];
    public static double[] exp = new double[4];
            
    public static void coefficientD(){
        c = 0;
        for (int j = 0; j < input; j++){
            coeff[j] *= exp[j];
            exp[j] --;
        }
    }
    
    public static void integralD(){
        c = 0;
        for (int q = 0; q < input; q++){
            exp[q] ++;
            coeff[q] /= exp[q];
            c -= (coeff[q]*Math.pow(x,(exp[q])));
        }
        c += y;
    }
    
    public static double round(double value) {
		//Rounds a double to 2 decimal places
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
    }
}
