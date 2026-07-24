package com.vineet.basic.logics.numbers;

public class CountingNumbers {

    public static void main(String[] args) {
        System.out.println("Number of Count :: "+getCountOfNumbers(1234));
    }

    private static int getCountOfNumbers(int n){
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
