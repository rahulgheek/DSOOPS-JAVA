package com.Rahul.day44;

import java.util.Scanner;

public class SumOfAllNumbers {
    static int sumOfNumbers(int n){
        int sum = 0;
        sum += n;
        if(n == 1){
            return sum;
        }
        sumOfNumbers(n-1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(sumOfNumbers(5));
    }
}
