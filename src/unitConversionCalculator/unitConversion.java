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

        System.out.println("Welcome to unit conversion!");
        System.out.println("We have the best converters");
        System.out.println("Distance - Mass - Time");
        System.out.println("Please enter which one you would like to use!");

        String choice = read.next();
        choice = choice.toLowerCase();

        if (choice.equals("distance")) {
            
            // The distance converter
            System.out.println("milli[1] - centi[2] - deci[3] - meter[4] - deka[5] - hecto[6] - kilo[7]");
            System.out.println("Please give distance, current unit, and desired unit:");
            double dist = read.nextDouble();
            int cUnit = read.nextInt();
            int dUnit = read.nextInt();

            System.out.println(distanceConvert(dist, dUnit, cUnit));
            
            
            
        } else if (choice.equals("mass")) {

        } else if (choice.equals("time")) {

        } else {
            System.out.println("Please try again.");
        }

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("imput your value");
        double imput = keyboard.nextDouble();
        System.out.println("imput your imput type");
        String imputType = keyboard.next();
        System.out.println("imput your converted output type");
        String outputType = keyboard.next();

        System.out.println("What to convert(enter: ms, s, min, or hours");
        String time1 = keyboard.next();
        System.out.println("What to convert to (enter: ms, s, min, or hours");
        String time2 = keyboard.next();
        System.out.println("input the amount of time to convert:");
        double time = keyboard.nextDouble();

        System.out.println(timeconvert(time1, time2, time) + " " + time2);

    }

    public static double distanceConvert(double dist, int dUnit, int cUnit) {

        // everything compared to cm first and inch first
        // int[] dUnit = new int[7];
        // everything is converted smallest first
        int dif = cUnit - dUnit;
        dist = dist * Math.pow(10, dif);

        return dist;
    }

    /**
     * convert units between grams, pounds and kilograms
     * @param imput the value of the imputed unit
     * @param imputType the type of the unit that was imputed
     * @param outputType the requested output unit
     * @return the imputed unit after being converted
     */
    public static double convertMass(double imput, String imputType, String outputType) { 
        //initialize a variable for the outputs
        double output = 1.0;
        //convert from grams
        if (imputType.equals("g") && (outputType.equals("kg"))) {
            output = imput / 1000;
        }
        if (imputType.equals("g") && (outputType.equals("pounds"))) {
            output = imput / 453.592;
        }
        //convert from kg
        if (imputType.equals("kg") && (outputType.equals("pounds"))) {
            output = imput * 2.20462;
        }
        if (imputType.equals("kg") && (outputType.equals("g"))) {
            output = imput * 1000;
        }
        //convert from pounds
        if (imputType.equals("pounds") && (outputType.equals("g"))) {
            output = imput * 453.592;
        }
        if (imputType.equals("pounds") && (outputType.equals("kg"))) {
            output = imput / 2.20462;
        }
        //return the converted output
        return output;

    }

    /**
     * This method takes 2 string inputs of different value and converts between
     * with a number that is inputed Method returns the value of the converted
     * time
     *
     * @param time1 The unit of time to be converted from
     * @param time2 The unit of time to be converted to
     * @param time The amount of time to be converted
     * @return
     */
    public static double timeconvert(String time1, String time2, double time) {

        // make a new time variable equal to input
        double newtime = time;

        //converting from milliseconds
        if (time1.equals("ms") && time2.equals("s")) {

            newtime = newtime / 1000;
        }

        if (time1.equals("ms") && time2.equals("min")) {

            newtime = newtime / 60000;
        }

        if (time1.equals("ms") && time2.equals("hours")) {

            newtime = newtime / 3600000;

        }

        //convert from seconds
        if (time1.equals("s") && time2.equals("ms")) {

            newtime = newtime * 1000;
        }

        if (time1.equals("s") && time2.equals("min")) {

            newtime = newtime / 60;
        }

        if (time1.equals("s") && time2.equals("hours")) {

            newtime = newtime / 3600;

        }

        //convert from minutes
        if (time1.equals("min") && time2.equals("s")) {

            newtime = newtime * 60;
        }

        if (time1.equals("min") && time2.equals("ms")) {

            newtime = newtime * 60000;
        }

        if (time1.equals("min") && time2.equals("hours")) {

            newtime = newtime / 60;

        }

        // convert from hours
        if (time1.equals("hours") && time2.equals("s")) {

            newtime = newtime * 3600;
        }

        if (time1.equals("hours") && time2.equals("min")) {

            newtime = newtime * 60;
        }

        if (time1.equals("hours") && time2.equals("ms")) {

            newtime = newtime * 3600000;

        }

        // return the converted time
        return newtime;
    }
}
