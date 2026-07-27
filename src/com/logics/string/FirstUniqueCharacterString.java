package com.logics.string;

public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        //String s="leetcode";
        String s ="dddccdbba";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        for (int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
