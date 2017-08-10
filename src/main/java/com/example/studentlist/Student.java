package com.example.studentlist;

import java.lang.*;


public class Student {

    String name;
    String surname;

    public Student (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return name + " " + surname;
    }

}
