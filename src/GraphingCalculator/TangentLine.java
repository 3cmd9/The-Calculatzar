/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author hzyy
 */
public class TangentLine  {
    
    /**
     * Finds the value of y at given x
     * @param power takes in the power of the term.
     * @param coef takes in the coefficient of the term.
     * @param x takes in the current x value.
     * @return the value of y at given x.
     */
    public static double findYAtX(double[] power, double[] coef, double x){
        double y = 0;
        for (int i = 0; i <= power.length-1; i++){
            y += coef[i]*(Math.pow((x), power[i]));
        }
        return y;
    }
    
    /**
     * Finds the value of slope of the original function
     * @param power takes in the power of the term.
     * @param coef takes in the coefficient of the term.
     * @param x takes in the current x value.
     * @return the slope of the function at x
     */
    public static double findSlopeOfFunction(double[] power, double[] coef, double x){
        return Math.pow((coef[0] * x), power[0]);
    }
    
    /**
     * Finds the y intercept of the tangent line.
     * @param slope finds the slope of the function.
     * @param x takes in any x and y point as long as they are the same.
     * @param y takes in any x and y point as long as they are the same.
     * @return the y-intercept of the tangent line.
     */
    public static double findYInt(double slope, double x, double y){
      return (y - (slope*x));
    }
    
}
