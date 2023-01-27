package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
public class CountingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string in the command line to be counted: ");
        String quote = input.nextLine();
        HashMap<Character , Integer> countMap = new HashMap<>();
        for (char letter: quote.toLowerCase().toCharArray()){
            if (countMap.containsKey(letter)) {
                int x = countMap.get(letter);
                countMap.put(letter, x + 1);
            }
            else {
                countMap.put(letter, 1);
            }
        }
        System.out.println(countMap);
    }
}
