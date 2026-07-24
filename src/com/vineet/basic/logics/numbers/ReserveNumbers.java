package com.vineet.basic.logics.numbers;

public class ReserveNumbers {

    public static void main(String[] args) {
        System.out.println("The Reserve of Number :: "+getReserveNumber(12345));

    }
    private static int getReserveNumber(int n){
        int reverse=0;
        while (n>0){
            n=n%10;
            reverse+=n;
        }
        return reverse;
    }
}
