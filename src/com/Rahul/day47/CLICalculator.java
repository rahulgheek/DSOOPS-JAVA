package com.Rahul.day47;

public class CLICalculator {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        int ch = args[1].charAt(0);

        if(ch == '+') System.out.println(num1+num2);
        else if (ch == '-') {
            System.out.println(num1 - num2);
        }
        else if(ch == '*') System.out.println(num1 * num2);
        else if(ch == '/') System.out.println(num1 / num2);
        else System.out.println("Enter valid inputs");
    }
}
