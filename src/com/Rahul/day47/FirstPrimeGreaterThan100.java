package com.Rahul.day47;

public class FirstPrimeGreaterThan100 {
    static boolean prime(int n){
        if(n <= 1) return false;
        for(int i = 2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int i = 100;
        while (true){
            if(prime(i)){
                System.out.println("Prime: " + i);
                break;
            }
            i++;
        }
    }
}
