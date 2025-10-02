package com.Rahul.day48;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,8,2,1,7};

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static int partition(int[] arr,int start,int end){
        int i = start-1;
        int pivot = arr[end];

        for(int j = start;j<=end;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    static void quickSort(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int part = partition(arr,start,end);

        quickSort(arr,start,part-1);
        quickSort(arr,part+1,end);
    }
}
