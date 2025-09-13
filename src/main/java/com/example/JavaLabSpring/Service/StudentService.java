package com.example.JavaLabSpring.Service;

import com.example.JavaLabSpring.Entity.StudentEntity;
import com.example.JavaLabSpring.RepositaryInterface.StudentJpaRepo;
import com.example.JavaLabSpring.RepositaryInterface.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo studentRepo;

    public StudentService(StudentJpaRepo studentJpaRepo) {
        this.studentJpaRepo = studentJpaRepo;
    }

    public StudentService() {
    }

    @Autowired
    private StudentJpaRepo studentJpaRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    public List<StudentEntity> getStudentName() {

        return (List<StudentEntity>) studentRepo.findAll();
    }

    //    public StudentEntity getStudentNameAndMarks(String)
    public StudentEntity createStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    public String fetchNameAndMarks(int id, int marks) {
        String response = null;
        try {
            response = studentRepo.fetch(id, marks);
        } catch (Exception e) {
            System.out.println(e);
        }
        return response;
    }

    public List<StudentEntity> fetchBySort() {
        return studentJpaRepo.findAll(Sort.by("studentName", "marks").ascending());
    }

    public void deleteRecord(int studentId) {
        studentJpaRepo.deleteById(studentId);
    }

    public Page<StudentEntity> recordsPagevise(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by("marks").ascending());
        return studentJpaRepo.findAll(pageable);
    }


}
