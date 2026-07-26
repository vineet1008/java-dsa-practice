package com.logics.string;

public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        String s="leetcode";
        int index=firstUniqChar(s);
    }

    private static int firstUniqChar(String s) {
        int left=0;
        int right=s.length()-1;
        char[] c=s.toCharArray();
        while (left<right){

            left++;
        }
    }
}
