package com.example.demo;

public class StudentInfo {
    private String fullName;
    private String age;
    private String studentID;
    private String address;
    private String email;
    private String motto;

    public StudentInfo(String fullName, String age, String studentID, String address, String email, String motto) {
        this.fullName = fullName;
        this.age = age;
        this.studentID = studentID;
        this.address = address;
        this.email = email;
        this.motto = motto;
    }

    public String formatInfo() {
        return "Fullname: " + fullName + "\n" +
               "Age: " + age + "\n" +
               "Student ID: " + studentID + "\n" +
               "Address: " + address + "\n" +
               "Email: " + email + "\n" +
               "Motto: " + motto;
    }

    // Getters (optional if you use formatInfo)
    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMotto() {
        return motto;
    }
}
