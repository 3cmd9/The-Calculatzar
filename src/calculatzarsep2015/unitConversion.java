/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzarsep2015;

/**
 *
 * @author 066955667
 */
public class unitConversion {
    
    /*
    inputs
        units of measurement(imperial and metric)
            distance
                cm, m, km,      inch, feet, yards, miles 49 ratio's
            mass
                g, kg,      pound 
            volume
                cc, cm       oz 9 ratio's
            area
                cm, m, km,      inch, feet, yards, miles 49 ratio's
        
    process
        convert
        add, sub, mult, divide
    
    output
        designated unit
            
        
    
    
    
    braedon
        distance
    
    nijet
        metric to imperial
    
    will
    
    
    
    */
    
   
   
    
    
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