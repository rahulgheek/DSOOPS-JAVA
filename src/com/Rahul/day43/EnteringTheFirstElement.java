package com.Rahul.day43;

import java.util.Arrays;
import java.util.Scanner;

public class EnteringTheFirstElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cache size: ");
        int size = input.nextInt();
        String[] arr = new String[size];
        input.next();

        System.out.print("Enter the cache elements: ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = input.next();
        }

        System.out.println(Arrays.toString(arr));
    }
}