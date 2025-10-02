package com.Rahul.day51;

import java.util.StringTokenizer;

public class CountNumberOfTokens {
    public static void main(String[] args) {
        String str = "This is a String";
        StringTokenizer st = new StringTokenizer(str);
        int count = 0;
        while(st.hasMoreTokens()){
            count++;
            st.nextToken();
        }
        System.out.println(count);
    }
}
