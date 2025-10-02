package com.Rahul.day49;

public class ReplaceVowels {

    static String ReplaceVowel(String str) {
        StringBuilder sb = new StringBuilder(str); // use StringBuilder since it's mutable
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                    c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.setCharAt(i, '*'); // replace vowel with '*'
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String result = ReplaceVowel(s);
        System.out.println(result); // Output: H*ll* W*rld
    }
}