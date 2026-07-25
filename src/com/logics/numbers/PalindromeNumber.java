package com.logics.numbers;

public class PalindromeNumber extends ReserveNumbers{

    public static void main(String[] args) {
        int n=545;
        if(n==getReserveNumber(n)){
            System.out.println("This Number is Palindrome Number");
        }else {
            System.out.println("This Number is not Palindrome Number");
        }
    }
}
