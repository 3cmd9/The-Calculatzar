package calculatzarsep2015;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *gg
 *
 * @author Haydn,Len and Ari
 */
public class StringCalculator {

    /**
     * gets user input for data to analyze and a keyword. The method will then
     * look for the number of occurrences of that keyword within the data
     */
    public static void inputCount() {
        Scanner reader = new Scanner(System.in);
        String data, searchWord; //String variables to store the inputs for the data to analyze and the keyword to search for
        System.out.println("Please enter the info you which to analyze.");
        data = reader.nextLine();
        System.out.println("Please enter the keyword to search for.");
        searchWord = reader.next().toLowerCase();
        String tempWord = "", capWord; //String variables to a store temporary word and a captial version of the temp word
        int occurenceCount = 0; //Integer vriable to store the number of occurences of the keyword
        capWord = searchWord.substring(0, 1).toUpperCase() + searchWord.substring(1, searchWord.length()); //captializes the first character in capword
        for (int i = 0; i < data.length(); i++) { //Loops the length of the data check for how many times the keyword occurs
            if (data.charAt(i) == ' ' || data.charAt(i) == ',' || data.charAt(i) == '.' || data.charAt(i) == '?' || data.charAt(i) == '!') { //selection statements to determine when to don a wordcheck
                if (tempWord.equals(searchWord) || tempWord.equals(capWord) || tempWord.equals(searchWord.toUpperCase())) { //Word check if statement to see if the temp word matches the keyword
                    occurenceCount++;
                }
                tempWord = "";
                continue;
            }
            tempWord = tempWord + data.charAt(i);
            if (i == data.length() - 1) {                                       //if statement for the word check on the last word.
                if (tempWord.equals(searchWord) || tempWord.equals(capWord) || tempWord.equals(searchWord.toUpperCase())) {
                    occurenceCount++;
                }
            }
        }
        System.out.println("The keyword(" + searchWord + ") appears " + occurenceCount + " time(s).");
    }

    /**
     * accepts the number of keywords, the keywords themselves, and the message
     * to be encrypted from the user. The value that the character will be
     * shifted by is determined by finding out which character of the message
     * corresponds to which character of the current key word the loop is on.
     * The current keyword is repeated for the entire length of the string. The
     * number of times the message is encrypted is the number of keywords, and
     * each time, the current message/encryption is encrypted by the keyword
     * being used.
     *
     * @return returns the encrypted message
     */
    public static String keyWordEncryption() { //should it instead be keywords and non keywords entered separately?

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
        int atChar; //used in charAt when determining the shift value after a key word has been repeated
        boolean shouldBreak = false; //stores wether a second for loop should be broken out of

        for (int x = 0; x < message.length; x++) {
            encoded[x] = message[x];
        }

        for (int x = 0; x < numKeyWords; x++) {
            //determines # of times KW fits into message
            keyWordInString = message.length / keyWords[x].length();
            for (int y = 0; y < message.length; y++) {

                //determines what the shift value should be based on the current character in the current key word
                atChar = y % keyWords[x].length();
                if (keyWords[x].charAt(atChar) >= 65 && keyWords[x].charAt(atChar) <= 90) {
                    shift = keyWords[x].charAt(atChar);
                    shift -= 65;
                } else if (keyWords[x].charAt(atChar) >= 97 && keyWords[x].charAt(atChar) <= 122) {
                    shift = keyWords[x].charAt(atChar);
                    shift -= 97;
                }

                //shifts the message
                //handles the char if its upper case, makes sure the character is cahnged if its out of bounds
                if (message[y] >= 65 && message[y] <= 90) {
                    encoded[y] += (char) shift;
                    if (encoded[y] > 90) {
                        encoded[y] = (char) ((encoded[y] - 90) + 64);
                    } else if (encoded[y] < 65) {
                        encoded[y] = (char) (91 - (65 - encoded[y]));
                    }
                } //handles the char if its lower case, makes sure the character is cahnged if its out of bounds
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

    /**
     * this cipher takes the inputted phrase and encrypts it so that each new
     * character is the characters to the left and right of its correspondent in
     * the entered message
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

        //adds the previous and next characters to the encrypted word, unless the current position is first or last in the message, then the next or previous characters (respectively) are added 
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
     * Determines the largest value letter in a string (z is greater than a). Then the index in
     * the alphabet of that letter becomes the value which the message is
     * shifted by
     *
     * @return returns the encrypted message
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

        //when a letter occurs, its index in an array representing the alphabet is set to one. 
        for (int x = 0; x < message.length(); x++) {
            if (message.charAt(x) >= 65 && message.charAt(x) <= 90) {
                atChar = message.charAt(x) - 65;
                largestChar[atChar] = 1;
            } else if (message.charAt(x) >= 97 && message.charAt(x) <= 122) {
                atChar = message.charAt(x) - 97;
                largestChar[atChar] = 1;
            }
        }

        //determines the last (largest) letter to have a one in its index (to have occured in the string)
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

        //encodes the message
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
     * provides a menu to allow the user to choose between various string
     * related methods, until the user wishes to exit
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean looper = true;
        int response;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to our String Calculatar!");
        while (looper == true) {
            System.out.println("Please select which function you wish to access. Enter the corresponding number. Enter something not listed to stop");
            System.out.println("(1)Keyword Encryption | (2) Input Count | (3)ASCII Converter | (4) String Counter | (5) Camel Case | (6) sampler Cipher | (7) Largest number Cipher");
            response = input.nextInt();
            if (response < 1 || response > 7) {
                break;
            }
            String empty = input.nextLine(); //used to absorb the fault of the following nextLines

            if (response == 1) {
                System.out.println(keyWordEncryption());
            } else if (response == 2) {
                inputCount();
            } else if (response == 3) {
                System.out.println("Please enter a statement to be processed:");
                String entry = input.nextLine();
                System.out.println("Processing...");
                System.out.println(asciiConverter(entry));
            } else if (response == 4) {
                System.out.println("Please enter a statement to be processed:");
                String entry = input.nextLine();
                System.out.println("Processing...");
                System.out.print("Characters: ");
                System.out.println(characterCount(entry));
                System.out.print("Vowels: ");
                System.out.println(vowelCount(entry));
            } else if (response == 5) {
                System.out.println("Please enter a statement to be processed:");
                String entry = input.nextLine();
                System.out.println("Processing...");
                System.out.println(camelCase(entry));
            } else if (response == 6) {
                System.out.println(samplerCipher());
            } else if (response == 7) {
                System.out.println(largestNum());
            }
        }
    }

}
