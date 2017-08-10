package com.example.studentlist;

import java.util.*;
import java.lang.*;


public class StudentlistApplication {

	public static void main(String[] args) {

		Student student1 = new Student("Jan", "Nowak");
		Student student2 = new Student("Jan", "Kowalski");
		Student student3 = new Student("Jan", "Malinowski");

		Grades grades1 = new Grades();
		grades1.addGrade(5.5);
		grades1.addGrade(1.5);
		grades1.addGrade(3.5);

		Grades grades2 = new Grades();
		grades2.addGrade(4.5);
		grades2.addGrade(3.5);
		grades2.addGrade(6.0);

		Grades grades3 = new Grades();
		grades3.addGrade(1.5);
		grades3.addGrade(2.5);
		grades3.addGrade(3.5);


		HashMap<Student, Grades> studentsGrades = new HashMap<Student, Grades>();

		studentsGrades.put(student1, grades1);
		studentsGrades.put(student2, grades2);
		studentsGrades.put(student3, grades3);


		for(Map.Entry<Student, Grades> entry: studentsGrades.entrySet()){

			System.out.println("The average of " + entry.getKey() + "'s grades is "
					+""+ entry.getValue().getGradesOfStudents());
		}

	}
}
