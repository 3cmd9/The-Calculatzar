/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitConversionCalculator;

import java.util.Scanner;

/**
 *
 * @author 066955667
 */
public class unitConversion {

    // cm[1], m[2], km[3],      inch[4], feet[5], yards[6], miles[7]
    
    public static double distanceConvert(double dist, int desiredUnit, int currentUnit) {

        // everything compared to cm first and inch first
        // int[] dUnit = new int[7];
        // everything is converted smallest first
        Scanner read = new Scanner(System.in); 
        
        System.out.println("cm[1] - m[2] - km[3] - inch[4] - feet[5] - yards[6] - miles[7]");
        System.out.println("Please give distance, current unit, and desired unit:");
        double distance = read.nextDouble();
        int cUnit = read.nextInt();
        int dUnit = read.nextInt();
        
        
        // metric or imperial
        if (desiredUnit > 3) {

            // converting to inches
            if (currentUnit == 5) {
                dist = dist / 12;
            }
            if (currentUnit == 6) {
                dist = dist / 36;
            }
            if (currentUnit == 7) {
                dist = dist / 63360;
            }

            // converting to desired unit
            if (desiredUnit == 7) {
                dist = dist * 63360;
            }
            if (desiredUnit == 6) {
                dist = dist * 36;
            }
            if (desiredUnit == 5) {
                dist = dist * 12;
            }

        } else {

            // converting to cm
            if (currentUnit == 3) {
                dist = dist / 100000;
            }
            if (currentUnit == 2) {
                dist = dist / 100;
            }

            // converting to desired unit
            if (desiredUnit == 3) {
                dist = dist * 100000;
            }
            if (desiredUnit == 2) {
                dist = dist * 100;
            }
        }

        return dist;
    }
    public static void main(String[] args) {
}

    
   
   
    
    
   public static double convertMass(double imput, String imputType, String outputType) {
       /*
      
       */
   double output = 1.0;
   if (imputType.equals("g") && (outputType.equals ("kg")) ) {
   output = imput / 1000;    
      }
    if (imputType.equals("g") && (outputType.equals ("pounds")) ) {
   output = imput / 453.592;
      }
    if (imputType.equals("kg") && (outputType.equals ("pounds")) ) {
   output = imput * 2.20462;
   }
    if (imputType.equals("kg") && (outputType.equals ("g")) ) {
   output = imput * 1000;
   }
    if (imputType.equals("pounds") && (outputType.equals ("g")) ) {
   output = imput * 453.592;
   }
    if (imputType.equals("pounds") && (outputType.equals ("kg")) ) {
   output = imput / 2.20462;
   }
    
       return output;
 
} 
}
