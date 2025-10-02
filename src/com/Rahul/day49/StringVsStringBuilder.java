package com.Rahul.day49;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int iterations = 10000;

        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        System.out.println(str);

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms");

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < iterations; i++) {
//            sb.append("a");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
