package com.logics.string;

public class StringPoolConstant {

    public static void main(String[] args) {

        String s1="Vineet";
        String s2="Vineet";

        System.out.println(s1==s2); //true its check the reference of the variable
        System.out.println(s1.equals(s2)); //true its check the value of the variable

        String s=new String("Vineet");

        System.out.println(s1==s); //false

        String ss=s.intern(); //this helps to points the reference into the scp

        System.out.println(s1==ss);


        String sb1=new String("Vineet");
        String sb2=new String("Vineet");

        System.out.println(sb1==sb2); //false Checks the references
        System.out.println(sb1.equals(sb2)); //true checks the values

        StringBuilder sb3=new StringBuilder("Vineet");
        StringBuilder sb4=new StringBuilder("Vineet");
        System.out.println(sb3==sb4); //true
        System.out.println(sb3.toString().equals(sb4.toString())); //true

    }
}
