package com.Rahul.day41;

import java.util.Arrays;

public class RemoveAllOccurences {
    static void removeOccurence(int[] arr,int n,int index){
        for(int i = index;i<n-1;i++){
            arr[i] = arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,3,3,7,8};
        int target = 3;

        int n = arr.length;
        int i = 0;
        while (i<n){
            if(arr[i] == target){
                removeOccurence(arr,n,i);
                n--;
            }
            else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
