package com.MPro.SpringSec.Controller;

import com.MPro.SpringSec.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(101,"Mukul",90),
            new Student(102,"Omi",85),
            new Student(103,"Vipul",98)
            )
    );

    @GetMapping("/students")
    public List<Student> getStudents(){
        return  students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student getStudents(@RequestBody Student s){
        students.add(s);
        return  s;
    }
}
