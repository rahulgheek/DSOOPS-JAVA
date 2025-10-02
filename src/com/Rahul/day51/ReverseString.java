package com.Rahul.day51;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.nextLine());

        String str = sb.toString();
        str = str.toLowerCase();

        sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }
}
