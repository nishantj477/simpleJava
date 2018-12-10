package org.nishant;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private long yearOfEnrollment;

    public Student(String fname, String lname, int age, long year) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.yearOfEnrollment = year;

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

   public String getFullName() {
        return firstName + " " + lastName;
   }

   public long getYearOfEnrollment() {
        return yearOfEnrollment;
   }
}
