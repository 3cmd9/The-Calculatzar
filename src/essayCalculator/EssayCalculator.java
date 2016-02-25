/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essayCalculator;

import java.util.Scanner;

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
         
         
         
         
         
         //Vowel count time!
        //loop through essay
         //once it comes across a, e, i ,o or u, add one to the appropriate letter 
          Scanner s = new Scanner(System.in);
    System.out.println("Please input essay");
     char A='a', E='e', I='i', O='o', U='u';
       int vowel[] = new int [5];
       
       for(int i =0; i<essay.length();i++){
           if (essay.charAt(i) == 'a'){
                   vowel[0] = vowel[0] +1;
           }
       else if (essay.charAt(i) == 'e'){
               vowel[1]= vowel[1] +1;
               }
       else if (essay.charAt(i) == 'i'){
               vowel[2]=  vowel[2] +1;
               }
       else if (essay.charAt(i) == 'o'){
               vowel[3]=  vowel[3] +1;
               }
       else if (essay.charAt(i) == 'u'){
               vowel[4]= vowel[4] +1;
               }
       }
       System.out.println("a=" + vowel[0] + " " +"e=" + vowel[1] + " " +"i=" +vowel[2] + " " +"o=" + vowel[3] + " " +"u=" + vowel[4]);
    }
    
         
         
         
         //if = a + 1 to 0
   
    
}
