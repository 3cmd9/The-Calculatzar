/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzarsep2015;

import java.util.*;

/**
 *
 * @author 341167849
 */
public class StringCalculator {
     public static void inputCount() {
         Scanner reader = new Scanner(System.in);
        String data, searchWord;
        System.out.println("Please enter the info you which to analyze.");
        data = reader.nextLine();
        System.out.println("Please enter the keyword to search for.");
        searchWord = reader.next().toLowerCase();
        String tempWord = "", capWord;
        int occurenceCount = 0;
        capWord = searchWord.substring(0, 1).toUpperCase() + searchWord.substring(1, searchWord.length());
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ' || data.charAt(i) == ',' || data.charAt(i) == '.' || data.charAt(i) == '?' || data.charAt(i) == '!') {
                if (tempWord.equals(searchWord) || tempWord.equals(capWord) || tempWord.equals(searchWord.toUpperCase())) {
                    occurenceCount++;
                }
                tempWord = "";
                continue;
            }
            tempWord = tempWord + data.charAt(i);
            if (i == data.length() - 1) {
                if (tempWord.equals(searchWord) || tempWord.equals(capWord) || tempWord.equals(searchWord.toUpperCase())) {
                    occurenceCount++;
                }
            }
        }
        System.out.println("The keyword(" + searchWord + ") appears " + occurenceCount + " time(s).");
    }

    public static void keyWordEncryption() { //should it instead be keywords and non keywords entered separately?

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the number of keywords");
        int numKeyWords = scan.nextInt(); //holds the number of key words the user intends to use
        String[] keyWords = new String[numKeyWords]; //stores every keyword
        System.out.println("Please input the number of total words in the message (keywords and non-keywords)");
        int numWords = scan.nextInt(); //stores the total number of words to be in the sentence
        String[] message = new String[numWords]; //stores the words of the message including keywords to be encoded
        String[] nonKeyWords = new String[numWords - numKeyWords]; //stores all the words to be encoded

        System.out.println("Please input the keywords");
        //gets keywords
        for (int x = 0; x < numKeyWords; x++) {
            keyWords[x] = scan.next();
        }

        System.out.println("Please input the nessage");
        //gets whole message
        for (int x = 0; x < message.length; x++) {
            message[x] = scan.next();
        }

        //gets non key words to be shifted
        for (int x = 0; x < nonKeyWords.length; x++) {
            //if (!message[x].equalsIgnoreCase(x))
        }
    }
     public static void main(String[] args) {
        inputCount();
     }

    /**
     * Creates a string of all the ASCII values separated by a space each by
     * using a for loop
     *
     * @param statement a string with all the characters to be converted into
     * ASCII values
     * @return returns a string which contains every single ASCII value (in
     * decimal) to be read out in other methods
     */
    public static String asciiConverter(String statement) {
        String output = "";
        String ascii[] = new String[statement.length()];
        for (int i = 0; i < statement.length(); i++) {
            ascii[i] = ((int) (statement.charAt(i)) + " ");
            output = output + ascii[i];
        }
        return output;

    }

    /**
     * Character count creates a variable equal to the amount of characters
     * excluding spaces by cycling through the string
     *
     * @param statement contains string to be analyzed
     * @return returns the amount of amount of non-space characters in the
     * string
     */
    public static int characterCount(String statement) {
        int cCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) != ' ') {
                cCount++;
            }
        }
        return cCount;
    }

    /**
     * vowelCount counts the amount of vowels in a string one character at a
     * time and then returns the amount of vowels which occur
     *
     * @param statement takes the statement to have the vowels counted
     * @return returns an integer equal to the amount of vowels that occur in
     * the string
     */
    public static int vowelCount(String statement) {
        int vCount = 0;
        statement = statement.toUpperCase();
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == 'A' || statement.charAt(i) == 'E' || statement.charAt(i) == 'I' || statement.charAt(i) == 'O' || statement.charAt(i) == 'U' || statement.charAt(i) == 'Y') {
                vCount++;
            }
        }
        return vCount;
    }

    /**
     * This converts sentences into camel case and will attempt to ignore extra
     * spaces, but leave in punctuation and numbers
     *
     * @param statement takes in the statement that is requested to be converted
     * @return returns a String which is the converted sentence
     */
    public static String camelCase(String statement) {
        boolean prevSpace = false;
        //boolean to check if the previous character was a space to indicate a new word
        int offset = 0;
        //offset increases by 1 for each space since null characters are converted into spaces
        char[] camel = new char[statement.length()];
        statement = statement.toLowerCase();
        //convert statement into lower case to make the transition easier
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == ' ') {
                prevSpace = true;
                offset++;
                continue;
                //if there is more than one space it will keep going until it hits an actual letter
            }
            if (prevSpace) {
                if (statement.charAt(i) < 97 || statement.charAt(i) > 122) {
                    camel[i - offset] = statement.charAt(i);
                    continue;
                }
                camel[i - offset] = (char) ((int) statement.charAt(i) - 32);
                prevSpace = false;
                continue;
            }
            camel[i - offset] = statement.charAt(i);
        }
        String camelCase = new String(camel);
        return camelCase;
    }
}
