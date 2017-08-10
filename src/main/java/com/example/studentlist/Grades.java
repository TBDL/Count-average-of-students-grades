package com.example.studentlist;

import java.util.*;
import java.lang.*;


public class Grades {

    ArrayList<Double> gradesOfStudents = new ArrayList<Double>();

    public void addGrade(double grade) {

        gradesOfStudents.add(grade);

    }

    public double getGradesOfStudents() {
        double sum = 0;
        for (int i = 0; i < gradesOfStudents.size(); i++) {

            sum += gradesOfStudents.get(i);

        }

        double total = (sum / gradesOfStudents.size());

        total = Math.round(total * 100);

        return total / 100;

    }
}