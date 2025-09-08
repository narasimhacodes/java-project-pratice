package com.example.JavaLabSpring.Configuration;

import com.example.JavaLabSpring.Entity.StudentEntity;
import com.example.JavaLabSpring.RepositaryInterface.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestData {

    @Bean
    CommandLineRunner loadData(final StudentRepo studentRepo){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                studentRepo.save(new StudentEntity(101, "Snr", 87));
                studentRepo.save(new StudentEntity(102, "Java",99));
                studentRepo.save(new StudentEntity(103, "Catlen",76));
                studentRepo.save(new StudentEntity(104, "Arine",87));
                studentRepo.save(new StudentEntity(105, "Bobbie",73));
                studentRepo.save(new StudentEntity(106, "Keerthi",64));
                studentRepo.save(new StudentEntity(107, "Ramki",96));
                studentRepo.save(new StudentEntity(108, "Santho",38));
                studentRepo.save(new StudentEntity(109, "Neha",73));
                studentRepo.save(new StudentEntity(110, "andrew",73));



            }
        };
    }

}

