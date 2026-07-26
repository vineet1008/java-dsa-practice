package com.logics.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder forwardReverse = new StringBuilder();
        //for forward case
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                forwardReverse.append(c);
            }
        }
        System.out.println(forwardReverse);

        //for backward case
        StringBuilder backwardReverse = new StringBuilder(forwardReverse);
        backwardReverse.reverse();

        System.out.println(backwardReverse);

        return forwardReverse.toString().equals(backwardReverse.toString());
    }
}
