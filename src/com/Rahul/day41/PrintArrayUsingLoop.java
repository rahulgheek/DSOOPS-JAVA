package com.Rahul.day41;
import java.util.Scanner;
import java.util.Arrays;

public class PrintArrayUsingLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values: ");
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}