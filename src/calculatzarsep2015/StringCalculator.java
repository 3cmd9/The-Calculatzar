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
     public static int inputCount(String data, String searchWord) {
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
        return (occurenceCount);
    }

    public static void keyWordEncryption() { //should it instead be keywords and non keywords entered separately?
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input the number of keywords");
        int numKeyWords = scan.nextInt(); //holds the number of key words the user intends to use
        String[] keyWords = new String[numKeyWords]; //stores every keyword
        System.out.println("Please input the number of total words in the message (keywords and non-keywords)");
        int numWords=scan.nextInt(); //stores the total number of words to be in the sentence
        String[] message=new String[numWords]; //stores the words of the message including keywords to be encoded
        String[] nonKeyWords = new String[numWords - numKeyWords]; //stores all the words to be encoded

        System.out.println("Please input the keywords");
        //gets keywords
        for (int x = 0; x < numKeyWords; x++) {
            keyWords[x]=scan.next();
        }
        
        System.out.println("Please input the nessage");
        //gets whole message
        for (int x=0;x<message.length;x++){
            message[x]=scan.next();
        }
        
        
        
        //gets non key words to be shifted
        for (int x=0;x<nonKeyWords.length;x++){
            //if (!message[x].equalsIgnoreCase(x))
        }
    }
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String data, searchWord;
        System.out.println("Please enter the info you which to analyze.");
        data = reader.nextLine();
        System.out.println("Please enter the keyword to search for.");
        searchWord = reader.next().toLowerCase();
        System.out.println("The keyword(" + searchWord + ") appears " + inputCount(data, searchWord) + " time(s).");
    }

}
