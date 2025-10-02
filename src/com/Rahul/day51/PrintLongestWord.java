package com.Rahul.day51;

import java.util.StringTokenizer;

public class PrintLongestWord {
    public static void main(String[] args) {
        String para = "This is paragraph where we will search longest word";

        StringBuilder sb = new StringBuilder(" ");

        StringTokenizer st = new StringTokenizer(para);

        while (st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.length() > sb.length())
                sb = new StringBuilder(word);
        }
        System.out.println(sb);
    }

}
