package com.Rahul.day51;

class Employee{
    String name;
    int id;
    String Dept;

    Employee(String n,int i,String D){
        name = n;
        id = i;
        Dept = D;
    }

    @Override
    public String toString(){

        return "Name: " + name + ", ID: " + id +", Dept: " + Dept;
    }
}

public class OverridetoString {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul",1,"CSE");

        System.out.println(emp.toString());
    }
}
