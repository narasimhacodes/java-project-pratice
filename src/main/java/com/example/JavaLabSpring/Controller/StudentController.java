package com.example.JavaLabSpring.Controller;

import com.example.JavaLabSpring.Entity.StudentEntity;
import com.example.JavaLabSpring.Service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    private StudentService studentService;

    @GetMapping(value = "/studentName")
    public List<StudentEntity> studentName() {
        return studentService.getStudentName();
    }

    @PostMapping(value = "/createStudent")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    @GetMapping(value = "/fetchNameAndMarks/studentId/{id}/marks/{marks}")
    public ResponseEntity fetchNamAndMarks(@PathVariable int id,
                                           @PathVariable int marks) {
        try {
            String result = studentService.fetchNameAndMarks(id, marks);
            if (result != null) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("something wrong");

            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");

        }

    }

    @GetMapping(value = "/fecthStudentInfo")
    public List<StudentEntity> fetchBySort() {
        return studentService.fetchBySort();

    }

    @GetMapping(value = "/deleteRecord/studentId/{id}")
    public void deleteRecord(@PathVariable int id) {
        studentService.deleteRecord(id);

    }

    @GetMapping(value = "/fetchPagewise/pageNo/{no}/pageSize/{size}")
    public Page<StudentEntity> fetchPageWise(@PathVariable int no,
                                             @PathVariable int size) {

        return studentService.recordsPagevise(no, size);
    }
}
