package com.amarmodi.jpa.hibernate.transactional;

import com.amarmodi.jpa.hibernate.transactional.model.Course;
import com.amarmodi.jpa.hibernate.transactional.repositories.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DataLoader implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final CourseRepository repository;

    public DataLoader(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Course course = this.repository.findById(10001L);
//        logger.info("Course 10001  -> {}", course);
//
//        repository.save(new Course("Microservices in 100 steps"));
        repository.playWithEntityManager();
    }
}
