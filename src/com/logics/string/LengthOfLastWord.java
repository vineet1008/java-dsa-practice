package com.logics.string;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s="Hello World";
        lengthOfLastWord(s.trim());
    }

    private static void lengthOfLastWord(String s) {
        int lengthOfLastWord=0;
        for (int i=s.length()-1;i>=0;i--){
            if(String.valueOf(s.charAt(i)).equalsIgnoreCase(" ")) {
                break;
            }
            lengthOfLastWord++;
        }
        System.out.println(lengthOfLastWord);
    }
}
