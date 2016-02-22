/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essayCalculator;

/**
 *
 * @author 070101720
 */
public class EssayCalculator {
    
    
    public static void countingCaps(String essay){
        String Letter = "";
                //Count Capital Letters and Lower Case Letters:
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] letters = alphabet.split("");
         for (int i = 0; i < letters.length; i++) {
                int HowMany = 0;
                while (essay.indexOf(letters[i]) > 0) {
                    essay = essay.substring(0, essay.indexOf(letters[i]) - 1) + essay.substring(essay.indexOf(letters[i]) + 1);
                    HowMany = HowMany + 1;
                    System.out.println(essay);
                } 
                if (HowMany != 0){
                Letter = Letter + letters[i] + ":" + HowMany + " ";
                }
            }
    }
}
