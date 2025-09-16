package com.Rahul.day42;

import java.util.Scanner;

public class LargestElementOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {9,6,78,53},
                {567,953,253,863}
        };

        for(int i = 0;i<arr.length;i++) {
            int largest = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (largest < arr[i][j]) {
                    largest = arr[i][j];
                }
            }
            System.out.println("The largest element in row " + i + ": " + largest);
        }
    }
}
