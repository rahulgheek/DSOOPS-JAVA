package com.Rahul.day49;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Hello";
        char[] arr = s.toCharArray();

        arr[0] = 'b';
        System.out.println(s);
        System.out.println(Arrays.toString(arr));
    }
}
