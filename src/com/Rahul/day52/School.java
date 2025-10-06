package com.Rahul.day52;

class Student{
    private String name;
    private int marks;

    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }
}

public class School {

    public static void displayDetails(Student s){
        System.out.println("Name: " +s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul",90);
        Student s2 = new Student("Raghav",80);
        displayDetails(s1);
        displayDetails(s2);
    }
}
