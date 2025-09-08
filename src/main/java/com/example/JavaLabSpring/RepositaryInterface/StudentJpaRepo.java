package com.example.JavaLabSpring.RepositaryInterface;

import com.example.JavaLabSpring.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public interface StudentJpaRepo extends JpaRepository<StudentEntity, Serializable> {

}
