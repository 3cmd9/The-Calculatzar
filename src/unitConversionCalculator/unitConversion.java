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

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("milli[1] - centi[2] - deci[3] - meter[4] - deka[5] - hecto[6] - kilo[7]");
        System.out.println("Please give distance, current unit, and desired unit:");
        double dist = read.nextDouble();
        int cUnit = read.nextInt();
        int dUnit = read.nextInt();

        System.out.println(distanceConvert(dist, dUnit, cUnit));

        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput your value");
        double imput = keyboard.nextDouble();
        System.out.println("imput your imput type");
        String imputType = keyboard.next();
        System.out.println("imput your converted output type");
        String outputType = keyboard.next();

    }

    public static double distanceConvert(double dist, int dUnit, int cUnit) {

        // everything compared to cm first and inch first
        // int[] dUnit = new int[7];
        // everything is converted smallest first
             
        int dif = cUnit - dUnit;
        dist = dist * Math.pow(10, dif);

        return dist;
    }

    

    public static double convertMass(double imput, String imputType, String outputType) {
        /*
      
         */
        double output = 1.0;
        if (imputType.equals("g") && (outputType.equals("kg"))) {
            output = imput / 1000;
        }
        if (imputType.equals("g") && (outputType.equals("pounds"))) {
            output = imput / 453.592;
        }
        if (imputType.equals("kg") && (outputType.equals("pounds"))) {
            output = imput * 2.20462;
        }
        if (imputType.equals("kg") && (outputType.equals("g"))) {
            output = imput * 1000;
        }
        if (imputType.equals("pounds") && (outputType.equals("g"))) {
            output = imput * 453.592;
        }
        if (imputType.equals("pounds") && (outputType.equals("kg"))) {
            output = imput / 2.20462;
        }

        return output;

    }
}
