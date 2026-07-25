package com.logics.recursion;

public class PrintsNumbers {

    public static void main(String[] args) {
        printNumbers(1);
    }

    private static void printNumbers(int n) {
        if(n==101){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
}
