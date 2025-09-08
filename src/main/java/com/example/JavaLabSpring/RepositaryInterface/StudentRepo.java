package com.example.JavaLabSpring.RepositaryInterface;

import com.example.JavaLabSpring.Entity.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {


    // user defined custome queries in repo interface
   @Query("select studentName From StudentEntity where studentId = :id AND marks = :marks")
   public String fetch(@Param("id") long id, @Param("marks") int marks);

    public StudentEntity findByStudentName(String studentName);

}
