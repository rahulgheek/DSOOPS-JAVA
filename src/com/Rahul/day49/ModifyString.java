package com.Rahul.day49;

public class ModifyString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();

        arr[0] = 'Y';

        for (char ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(str);
    }
}
