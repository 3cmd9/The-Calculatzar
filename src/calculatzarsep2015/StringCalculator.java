/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzarsep2015;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Haydn
 */
public class StringCalculator {

    /**
     *
     * @return
     */
    public static String keyWordEncryption() {
        // y%keyWord[x].length
        //ATTENTION PLS - the problem when using 2 keywords is that when encrypting for the second time it is reset with new shifts instead of being added ontop.
        //POSSIBL SOLUTION TO IMPLEMENT - before any loops set encoded to = message, and when you do shift, add the values on as opposed to reseting values
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the number of keywords");
        int numKeyWords = scan.nextInt(); //holds the number of key words the user intends to use
        String[] keyWords = new String[numKeyWords]; //stores every keyword

        System.out.println("Please input the keywords");
        //gets keywords
        for (int x = 0; x < numKeyWords; x++) {
            keyWords[x] = scan.next();

        }
        scan.nextLine();

        System.out.println("Please enter your message");
        String messageLength = scan.nextLine(); //stores the message and used to determine message length
        char[] message = new char[messageLength.length()]; //stores the words of the message including keywords to be encoded
        message = messageLength.toCharArray();

        char[] encoded = new char[message.length]; //stores encrypted message 
        String encryption = ""; //stores the final encrypted message as a string
        int shift = 0; //stores the value to shift the characters by
        int keyWordInString; //stores the number of times the keyword being used fits into the message
        int atChar = 0; //used in charAt when determining the shift value after a key word has been repeated
        boolean shouldBreak = false; //stores wether a second for loop should be broken out of

        for (int x = 0; x < message.length; x++) {
            encoded[x] = message[x];
        }

        for (int x = 0; x < numKeyWords; x++) {
            //determines # of times KW fits into message
            keyWordInString = message.length / keyWords[x].length();
            for (int y = 0; y < message.length; y++) {

                atChar = y % keyWords[x].length();
                if (keyWords[x].charAt(atChar) >= 65 && keyWords[x].charAt(atChar) <= 90) {
                    shift = keyWords[x].charAt(atChar);
                    shift -= 65;
                } else if (keyWords[x].charAt(atChar) >= 97 && keyWords[x].charAt(atChar) <= 122) {
                    shift = keyWords[x].charAt(atChar);
                    shift -= 97;
                }

                //shifts the message
                //handles the char if its upper case
                if (message[y] >= 65 && message[y] <= 90) {
                    encoded[y] += (char) shift;
                    if (encoded[y] > 90) {
                        encoded[y] = (char) ((encoded[y] - 90) + 64);
                    } else if (encoded[y] < 65) {
                        encoded[y] = (char) (91 - (65 - encoded[y]));
                    }
                } //handles the char if its lower case
                else if (message[y] >= 97 && message[y] <= 122) {
                    encoded[y] += (char) shift;
                    if (encoded[y] > 122) {
                        encoded[y] = (char) ((encoded[y] - 122) + 96);
                    } else if (encoded[y] < 97) {
                        encoded[y] = (char) (123 - (97 - encoded[y]));
                    }
                }
            }
        }
        for (int x = 0; x < encoded.length; x++) {
            encryption += encoded[x];

        }

        return encryption;
    }

    /**
     * this cipher takes the inputted phrase and encrypts it so that each new
     * character is a result of the characters to the left and right of its
     * correspondant in the entered message
     *
     * @return returns the encrypted message
     */
    public static String samplerCipher() {

        Scanner scan = new Scanner(System.in);
        String phrase = ""; //stores the phrase entered by the user
        String encoded = ""; //stores the encrypted phrase

        System.out.println("Please enter your phrase: ");
        phrase = scan.nextLine();
        char[] codedWord = new char[2 * phrase.length()]; //stores the current encrypted phrase, which can be manipulated and eventually turned into a string

        for (int x = 0; x < phrase.length(); x++) {
            if ((x - 1) >= 0 && (x + 1) < phrase.length()) {
                encoded += phrase.charAt(x - 1);
                encoded += phrase.charAt(x + 1);
            } else if ((x - 1) < 0) {
                encoded += phrase.charAt(x + 1);
            } else if ((x + 1) >= phrase.length()) {
                encoded += phrase.charAt(x - 1);
            }
        }

        return encoded;
    }

    /**
     *
     * @return
     */
    public static String largestNum() {

        String encryption = ""; //holds the encrypted string
        Scanner scan = new Scanner(System.in);
        char[] largestChar = new char[26]; //stores when a character occurs, so the largest one can be determined
        char largestCharacter = 'a'; //stores the largest char
        int atChar = 0; //stores where in the index of the array something is stored
        int shift = 0; //determines how much the letters of the message will be shifted through the alphabet by

        System.out.println("Please enter your message: ");
        String message = scan.nextLine();
        char[] codedWord = new char[message.length()]; //creates a character array to be more easily manipulated when encrypting

        for (int x = 0; x < message.length(); x++) {
            if (message.charAt(x) >= 65 && message.charAt(x) <= 90) {
                atChar = message.charAt(x) - 65;
                largestChar[atChar] = 1;
            } else if (message.charAt(x) >= 97 && message.charAt(x) <= 122) {
                atChar = message.charAt(x) - 97;
                largestChar[atChar] = 1;
            }
        }

        for (int x = 0; x < largestChar.length; x++) {
            if (largestChar[x] > 0) {
                largestCharacter = (char) (x + 65);
            }
        }

        //sets shift value to a number within the range of the alphabet
        shift = largestCharacter - 65;

        //assigns the text of message to the char array codedWord
        for (int x = 0; x < message.length(); x++) {
            codedWord[x] = message.charAt(x);
        }

        for (int x = 0; x < message.length(); x++) {
            //This if statement handles the character if it is upper case
            if (codedWord[x] >= 65 && codedWord[x] <= 90) {
                codedWord[x] = (char) (codedWord[x] + shift);
                if (codedWord[x] > 90) {
                    codedWord[x] = (char) ((codedWord[x] - 90) + 64);
                } else if (codedWord[x] < 65) {
                    codedWord[x] = (char) (91 - (65 - codedWord[x]));
                }
                //else if to handle if the character is lower case    
            } else if (codedWord[x] >= 97 && codedWord[x] <= 122) {
                codedWord[x] = (char) (codedWord[x] + shift);
                if (codedWord[x] > 122) {
                    codedWord[x] = (char) ((codedWord[x] - 122) + 96);
                } else if (codedWord[x] < 97) {
                    codedWord[x] = (char) (123 - (97 - codedWord[x]));
                }
            }
        }

        for (int x = 0; x < codedWord.length; x++) {
            encryption = encryption + codedWord[x];
        }

        return encryption;
    }

    /**
     *
     * @param args
     */
}
