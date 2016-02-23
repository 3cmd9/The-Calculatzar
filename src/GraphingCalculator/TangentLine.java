/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphingCalculator;

/**
 *
 * @author 348839168
 */
public class TangentLine {
    
    public static double findYAtX(int[] power, int[] coef, int x){
        double y = 0;
        for (int i = 0; i <= power.length-1; i++){
            y += coef[i]*(Math.pow((x), power[i]));
        }
        return y;
    }
    
    public static double findSlopeOfFunction(int[] power, int[] coef, int x, int y){
        return Math.pow((coef[0] * x), power[0]);
    }
    
    public static double findYInt(double slope, double x, double y){
      return y - (slope*x);
    }
    
}
