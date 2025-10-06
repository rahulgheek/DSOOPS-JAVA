package com.Rahul.day52;

class Person{
    String name;
    private String address;
    Person(String n,String a){
        name = n;
        address = a;
    }

    public void printAddress(){
        System.out.println(address);
    }
}

public class PrintUsingPublicMethod {
    public static void main(String[] args) {
        Person p = new Person("Rahul","dera bassi");
        p.printAddress();
    }
}
