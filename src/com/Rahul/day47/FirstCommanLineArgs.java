package com.Rahul.day47;

public class FirstCommanLineArgs {
    public static void main(String[] args) {
        if(args.length==0) System.out.println("No Args");
        else System.out.println(args[0]);
    }
}