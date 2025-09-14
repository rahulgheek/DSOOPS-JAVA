package com.Rahul.day38;

//What is the output of the following loop:

// Answer : 0 2

public class OutputOfCode {
    public static void main(String[] args) {
        for(int i = 0;i<3;i++){
            if(i==1) continue;
            System.out.print(i + " ");
        }
    }
}
