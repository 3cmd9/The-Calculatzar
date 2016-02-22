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
    
    private static int[] coef = new int[4];
    private static int[] power = new int[4];
    private static double y = 300;
 
    public static void main(String[]args){
        init();
    }
    
    private static void init(){
        coef[0] = 4;
        power[0] = 4;
        coef[1] = 3;
        power[1] = 3;
        coef[2] = 2;
        power[2] = 2;
        coef[3] = 1;
        power[3] = 1;
    }
    
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
