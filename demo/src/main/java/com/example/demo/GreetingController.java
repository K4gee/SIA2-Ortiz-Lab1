package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class GreetingController {

    private String fullName = "Ortiz, Kacie A.";
    private String age = "21";
    private String studentID = "204155";
    private String address = "UEP Zone III";
    private String email = "ortizkacie16@gmail.com";
    private String motto = "Kung ang english ng araw ay sun,\nang ulam namin ay chicken joy.";

    @GetMapping
    public String getStudentInfo() {
        StudentInfo studentInfo = new StudentInfo(fullName, age, studentID, address, email, motto);
        return studentInfo.formatInfo(); // Return the formatted info
    }
}
