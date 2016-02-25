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

    /**
     * An input routine that allows the class' methods to be used. It allows
     * input to be entered once, and any of the calculations to be made
     * infinite times.
     *
     * @author Erica Garand
     * @param args
     */
    public static void main(String[] args) {
        String input = "", pickOne = "";
        StringBuilder essay = new StringBuilder();
        Scanner keyboard = new Scanner(System.in);
        boolean error;
        
        System.out.printf("Enter the essay to use in the calculations. "
                + "Enter \'stop\' on a single line to move on.%n%n");

        do {
            if (keyboard.hasNext() == true) {
                input = keyboard.nextLine();
            }
            if (input.trim().equalsIgnoreCase("stop") == false) {
                essay.append(String.format(input + "%n"));
            }//end if
        } while (input.trim().equalsIgnoreCase("stop") == false);//end while

        input = essay.toString();
	//the method will use the String called 'input' to do the thing.
        //Ex. numberOfVowels(input);
        
        //this for loop will run forever and ever and ever.
           for (;;) {
            do {
                error = false;
                System.out.printf("%n%nWhich calculation would you like to make?%n");

                // THIS IS THE MENU STRING:
                System.out.printf("1: Average word length %n"
                        + "2: Number of paragraphs %n"
                        + "3: Number of Capital Letters %n"
                        + "4: Number of Lower Case Letters %n"
                        + "5: Number of Spaces %n");

                pickOne = keyboard.next();
                if (pickOne.matches("[0-9]+") == false) {
                    error = true;
                    System.out.printf("%nError: invalid input. Please enter a number.");
                }
            } while (error == true);

            //ERICA'S METHODS: 
            if (Integer.parseInt(pickOne) == 1) {
                System.out.printf("%nAverage Word Length: " + avgWordLength(input));
            } else if (Integer.parseInt(pickOne) == 2) {
                System.out.printf("%nNumber of Paragraphs: " + numberOfParagraphs(input));
            } //STEPHANIE'S METHODS
            else if (Integer.parseInt(pickOne) == 3) {
                System.out.println(countingLower(input));
            } else if (Integer.parseInt(pickOne) == 4) {
                System.out.println(countingCaps(input));
            } else if (Integer.parseInt(pickOne) == 5) {
                System.out.println(countingSpaces(input));
            } //??'S METHODS
            else if (Integer.parseInt(pickOne) == 6) {
                System.out.println("Enter your method call here, and put the number it's triggered by in the menu string above.");
            } else if (Integer.parseInt(pickOne) == 7) {
                System.out.println("Enter your method call here, and put the number it's triggered by in the menu string above.");
            }
        }
    }

    
    
    /**
     * Returns a double representing the average length of the words within a
     * string. Words are defined as alphabetic characters separated by any kind
     * of whitespace. If given an empty string, the method returns 0.
     *
     * @author Erica Garand
     * @param str the string containing the words to count the lengths of. Can
     * have multiple lines.
     * @return the average word length as a double.
     */
    public static double avgWordLength(String str) {
        //split string into an array, using a delimiter of any whitespace character. Remove all non alphabetical characters while splitting.
        String[] words = str.trim().replaceAll("[^A-Za-z\\s]", "").split("\\s+");
        //the amount of words is the amount of elements the string was split into
        double wordCount = words.length, letterCount = 0;

        //add the amount of letters in each word to the total letter count
        for (int i = 0; i < words.length; i++) {
            letterCount += words[i].trim().length();
        }

        //return the average word length (letter total / word total), rounded to two decimal places
        if (wordCount != 0) {
            return (double) (Math.round((letterCount / wordCount) * 100d) / 100d);
        } else {
            return 0;
        }
    }

    /**
     * Returns an integer representing the amount of paragraphs, within a
     * string. Paragraphs are defined as one or more lines of text separated by
     * one or more empty lines.
     *
     * @author Erica Garand
     * @param str the string containing the text to count for paragraphs.
     * @return the amount of paragraphs as an integer
     */
    public static int numberOfParagraphs(String str) {
        //split string into an array, using a delimiter of one newline character
        String[] paragraphs = str.trim().split("[\n]");
        int count = 1;

        //if an empty line is encountered, add to the paragraph count
        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].trim().isEmpty() == true) {
                count++;
            }
        }

        return count;
    }

            
         
         
         //Vowel count time!
        //loop through essay
         //once it comes across a, e, i ,o or u, add one to the appropriate letter 
    //selby j
        public static void Vowel(String essay){
    System.out.println("Please input essay");
    
 //    char A='a', E='e', I='i', O='o', U='u';
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

public static String countingCaps(String essay) {
        String Letter = "";
        //Count Capital Letters and Lower Case Letters:
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] letters = alphabet.toCharArray();
        int q;
        for (int i = 0; i < letters.length; i++) {
            int HowMany = 0;
            for (q = 0; q < essay.length(); q++) {
                if (essay.charAt(q) == letters[i]) {
                    HowMany++;
                }
            }
            if (HowMany != 0) {
                Letter = Letter + HowMany + " " + letters[i] + "('s), ";
            }
        }
        return ("This essay contains " + Letter);
    }

    public static String countingLower(String essay) {
        String Letter = "";
        //Count Capital Letters and Lower Case Letters:
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] letters = alphabet.toCharArray();
        int q;
        for (int i = 0; i < letters.length; i++) {
            int HowMany = 0;
            for (q = 0; q < essay.length(); q++) {
                if (essay.charAt(q) == letters[i]) {
                    HowMany++;
                }
            }
            if (HowMany != 0) {
                Letter = Letter + HowMany + " " + letters[i] + "('s), ";
            }
        }
        return ("This essay contains " + Letter);
    }

    public static String countingSpaces(String essay) {
        String Letter = "";
        //Count Capital Letters and Lower Case Letters:
        String space = "\\s";
        int HowMany = -2;

        for (int i = 0; i < essay.length(); i++) {

            if (String.valueOf(essay.charAt(i)).matches(space)) {
                HowMany++;
            }
        }

        if (HowMany != 0) {
            return ("There are " + HowMany + " spaces in this essay");
        } else {
            return ("There are no spaces in this essay");

        }
    }
   
    
         
         
         
         //if = a + 1 to 0
   
    
}
