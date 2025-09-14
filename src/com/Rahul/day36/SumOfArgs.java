package com.Rahul.day36;

// step 1 : create the file java file in desktop
// step 2 : run javac SumOfArgs.java in cmd -> a bytecode file will be created in the desktop
// step 3 : run java SumOfArgs 1 5 9 in cmd -> Output : 15 will be shown;

public class SumOfArgs {
    public static void main(String[] args) {
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
    }
}
