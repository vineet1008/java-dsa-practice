package com.logics.string;

public class ReverseString {

    public static void main(String[] args) {
        getReverseString();
        getReverseStringWithStringBuilder();
        //Or we can use the StringBuffer which is ThreadSafe
    }

    private static void getReverseStringWithStringBuilder() {
        StringBuilder sb=new StringBuilder("Vineet").reverse(); //This is not ThreadSafe
        System.out.println("The String is reverse through StringBuilder "+sb);
    }

    private static void getReverseString() {
        String name="Vineet";
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i)+"";
        }
        System.out.println("The Reverse of String is "+reverse);

    }
}
