package com.Rahul.day50;

public class SentenceUsingStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Learning");

        str.append(" Java");
        str.insert(str.length()," with fun");
        System.out.println(str);
    }
}
