package com.Rahul.day52;

class Car{
    String make;
    int year;

    Car(String m,int y){
        make = m;
        year = y;
    }

    public void printDetails(){
        System.out.println("Make: " + make + ", Year: " + year);
    }
}

public class CreateCarObject {
    public static void main(String[] args) {
        Car c = new Car("BMW",2006);
        c.printDetails();
    }
}
