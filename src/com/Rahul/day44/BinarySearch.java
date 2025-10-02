package com.Rahul.day44;

public class BinarySearch {
    static int binarySearch(int[] arr,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid = (left + right) / 2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] > target) {
            return binarySearch(arr,left,mid-1,target);
        }
        else return BinarySearch.binarySearch(arr,mid+1,right,target);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,14,56,6453};

        System.out.println(binarySearch(arr,0,arr.length-1,9));
    }
}
