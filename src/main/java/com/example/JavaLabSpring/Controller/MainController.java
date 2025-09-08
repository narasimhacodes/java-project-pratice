package com.example.JavaLabSpring.Controller;

import com.example.JavaLabSpring.Request.StudentRequest;
import com.example.JavaLabSpring.Response.StudentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/mainjava")
public class MainController {
    //This is main controller
    @PostMapping(value = "/hello",
            produces = "application/xml",
            consumes = "application/json")
    public Map<String, Object> sayHello(@RequestBody StudentRequest request){

        StudentResponse st1 = new StudentResponse();
        st1.setId(request.getId());
        st1.setName(request.getName());
        st1.setMarks(request.getMarks());
        st1.setAddress(request.getAddress());


        StudentResponse st2 = new StudentResponse();
        st2.setId(13);
        st2.setName("Java");
        st2.setMarks("1211");
        st2.setAddress("Navulur");


        List<StudentResponse> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        Map<String, Object> studentslist = new HashMap<>();
        studentslist.put("StudentsList", students);
        return studentslist;
    }
}
