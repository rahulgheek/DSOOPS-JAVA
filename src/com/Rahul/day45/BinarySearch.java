package com.Rahul.day45;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,14,56,6453};
        int target = 6453;

        int left = 0;
        int right = arr.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                System.out.println("Target found at: " + mid);
                break;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
    }
}
