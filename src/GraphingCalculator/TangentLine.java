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
    
    private static int[] coef = new int[3];
    private static int[] power = new int[3];
    private static double y = 300;
 
    public static void main(String[]args){
        init();
    }
    
    private static void init(){
        coef[0] = 4;
        power[0] = 4;
        coef[1] = 4;
        power[1] = 4;
        coef[2] = 4;
        power[2] = 4;
        coef[3] = 4;
        power[3] = 4;
    }
    
    public static double findYAtX(int[] power, int[] coef, int x){
        double y = 0;
        for (int i = 0; i <= power.length-1; i++){
            y += Math.pow((coef[i] * x), power[i]);
        }
        return y;
    }
    
    public static double findSlopeOfFunction(int[] power, int[] coef, int x, int y){
        double slope;
        slope = Math.pow((coef[0] * x), power[0]);
        
        return 0;
    }
    
}
