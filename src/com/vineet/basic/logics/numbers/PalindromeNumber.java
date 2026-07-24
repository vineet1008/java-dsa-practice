package com.vineet.basic.logics.numbers;

public class PalindromeNumber extends ReserveNumbers{

    public static void main(String[] args) {
        int pn=545;
        if(pn==getReserveNumber(pn)){
            System.out.println("This Number is Palindrome Number");
        }else {
            System.out.println("This Number is not Palindrome Number");
        }
    }
}
