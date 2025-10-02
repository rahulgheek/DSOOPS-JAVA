package com.Rahul.day50;

public class IncrementingValues {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        int iterations = 10000;

        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        System.out.println(str);

        long end1 = System.currentTimeMillis();
        System.out.println("Time taken: " + (end1 - start1) + " ms");
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long end2 = System.currentTimeMillis();
       System.out.println("Time taken: " + (end2 - start2) + " ms");
    }
}
