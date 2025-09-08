package com.example.JavaLabSpring.Controller;

import com.example.JavaLabSpring.Request.StudentRequest;
import com.example.JavaLabSpring.Response.StudentListResponse;
import com.example.JavaLabSpring.Response.StudentResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/mainjava")
public class JsonToXml {
    @PostMapping(value = "/JsonToxml")
//            consumes = MediaType.APPLICATION_XML_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE
    public StudentListResponse sayHello(@RequestBody StudentRequest request){

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

        return new StudentListResponse(students);
    }
}
