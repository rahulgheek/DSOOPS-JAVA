package com.Rahul.day44;


import java.util.Scanner;

public class CountdownFromNto1 {
    static void countdown(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        countdown(n);
    }
}