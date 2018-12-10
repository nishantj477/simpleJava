package org.nishant;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String fname, String lname, int age) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;

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
}
