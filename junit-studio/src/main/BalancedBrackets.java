package main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int numberOfFrontBrackets = 0;
        int numberOfBackBrackets = 0;
        char[] charArray = new char[str.toCharArray().length];
        charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] == '0' || charArray[i] == 'a'){
                charArray[i] = 'b';
            }
        }
        for (int i = 0; i < charArray.length; i++){
            if(charArray[i] == '['){
                numberOfFrontBrackets++;
                for(int j = 0; j < charArray.length; j++){
                    if(charArray[j] == ']'){
                        if(i > j){
                            return false;
                        }
                        else{
                            charArray[j] = '0';
                            numberOfBackBrackets++;
                            break;
                        }
                    }
                }
            }
        }
        if(numberOfFrontBrackets != numberOfBackBrackets){
            return false;
        }
            for(char ch: charArray){
                if(ch == ']'){
                    return false;
                }
            }
        boolean stop = false;
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] == '['){
                charArray[i] = 'a';
                stop = true;
                for (int j = 0; j < charArray.length; j++){
                    if (stop == true) {
                        if (charArray[j] == '[') {
                            for (int k = 0; k < charArray.length; k++) {
                                if (charArray[k] == '0') {
                                    if (k > j) {
                                        return false;
                                    } else {
                                        charArray[k] = '1';
                                        stop = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
            return true;
    }
}
