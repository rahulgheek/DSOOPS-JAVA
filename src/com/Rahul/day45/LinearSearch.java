package com.Rahul.day45;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("Index Of the target " + target + " : " + i);
            }
        }
    }
}
