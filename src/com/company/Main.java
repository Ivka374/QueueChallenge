package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string){
        Queue<Character> characterQueue = new LinkedList<>();
        boolean isPalindrome = false;
        string = string.toLowerCase();
        char[] noSpaces = string.toCharArray();

        for (int i = noSpaces.length -1; noSpaces.length%2 == 0 ? i >= noSpaces.length/2: i > noSpaces.length/2; i--){
            if (Character.isLetter(noSpaces[i])){
                characterQueue.add(noSpaces[i]);
            }
        }

        for (int i = 0; i < characterQueue.size(); i++){
            if (Character.isLetter(noSpaces[i])){
                char compare = characterQueue.remove();
                if (compare == noSpaces[i]){
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }

        return isPalindrome;
    }
}
