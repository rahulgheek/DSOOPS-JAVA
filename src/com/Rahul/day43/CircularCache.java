package com.Rahul.day43;
import java.util.Arrays;
import java.util.Scanner;

public class CircularCache {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int[] rawData = {1,2,3,4,5,6,7,8};
        int next = 0;
        for(int i = 0;i<rawData.length;i++){
            arr[next] = rawData[i];
            next = (next+1) % arr.length;
            for (int c:arr){
                if (c!=0) System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
