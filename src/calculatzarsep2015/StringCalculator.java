/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatzarsep2015;

import java.util.Scanner;

/**
 *
 * @author 341167849
 */
public class StringCalculator {

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

}
