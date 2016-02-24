/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzarsep2015;

import java.util.*;

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

    public static void main(String[] args) {
        boolean looper = true;
        int response;
        String statement;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to our String Calculatar!");
        while (looper == true) {
            System.out.println("Please select which function you which to access. Enter the corresponding number.");
            System.out.println("(1)Keyword Encryption | (2) Input Count | (3)ASCII Converter | (4) String Counter | (5) Camel Case");
            response = input.nextInt();
            if (response == 1) {
                keyWordEncryption();
            } else if (response == 2) {
                inputCount();
            } else if (response == 3) {
                asciiConverter();
            } else if (response == 4) {
                characterCount();
                vowelCount();
            } else if (response == 5) {
                camelCase();
            }
        }
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
