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
