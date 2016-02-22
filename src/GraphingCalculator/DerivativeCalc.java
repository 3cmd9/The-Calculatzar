/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphingCalculator;

/**
 *
 * @author 068684570
 */
public class DerivativeCalc {
    
    public final static int input = 4;
    public final static int length = input + 1;
    public final static int x = 4;
    public final static int y = 4;
    public static int[] coeff = new int[length];
    public static int[] exp = new int[length];
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static void coefficientD(){
        for (int i = 0; i < length; i++){
            exp[i] --;
            coeff[i] *= exp[i];
        }
    }
    
    public static void integralD(){
        for (int i = 0; i < length-1; i++){
            exp[i] ++;
            coeff[i] /= exp[i];
        }
        coeff[input+1] = 0;
    }
        
}
