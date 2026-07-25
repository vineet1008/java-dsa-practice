package com.logics.recursion;

public class Factorial {

    public static void main(String[] args) {
        printFactorial(2);
    }

    private static void printFactorial(int i) {
        if(i==0){
            return;
        }
        System.out.print(i*i+" ");
        printFactorial(i-1);
    }
}
