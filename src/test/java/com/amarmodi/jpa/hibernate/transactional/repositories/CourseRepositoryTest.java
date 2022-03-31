package com.amarmodi.jpa.hibernate.transactional.repositories;

import com.amarmodi.jpa.hibernate.transactional.model.Course;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository repository;

    @Test
    void findById_basic() {
        Course course = this.repository.findById(10001L);
        assertEquals("JPA in 50 Steps", course.getName());
    }

    @Test
    @DirtiesContext
    void deleteById_basic() {
        this.repository.deleteById(10002L);
        assertNull(repository.findById(10002L));
    }

    @Test
    public void simpleTest(){
        logger.info("In the play with Entity Manager");
        repository.playWithEntityManager();

    }
}