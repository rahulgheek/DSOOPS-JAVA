package com.Rahul.day42;

import java.util.Arrays;

public class FirstAndLastRowOfArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {9,6,78,53},
                {56,86,23,90},
                {86,23,89,64}
        };

        for(int i = 0;i<arr.length;i++){
            if(i==0 || i == arr.length-1) {
                System.out.println(Arrays.toString(arr[i]));
            }
        }
    }
}
