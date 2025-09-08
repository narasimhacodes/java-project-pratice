package com.example.JavaLabSpring.Response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement(name = "StudentListResponse")
public class StudentListResponse {

    private List<StudentResponse> studentResponseList;

    public StudentListResponse(List<StudentResponse> studentResponseList) {
        this.studentResponseList = studentResponseList;
    }
 @XmlElement(name = "studentResponse")
    public List<StudentResponse> getStudentResponseList() {
        return studentResponseList;
    }

    public void setStudentResponseList(List<StudentResponse> studentResponseList) {
        this.studentResponseList = studentResponseList;
    }
}
