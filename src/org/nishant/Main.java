package org.nishant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Nishant", "Joshi", 24));
        students.add(new Student("Rajesh", "Kumar", 28));

        for(Student s : students) {
            System.out.println(s.getFullName());
        }
    }
}
