package org.nishant;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;

    public Student(String fname, String lname, int age, String sid) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.studentId = sid;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
   }
}
