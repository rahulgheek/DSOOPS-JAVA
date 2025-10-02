package com.Rahul.day51;

public class CheckPalindrome {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ABba");

        String str1 = sb.toString();
        String str2 = sb.reverse().toString();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
