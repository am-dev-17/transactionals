package com.amarmodi.jpa.hibernate.transactional.repositories;

import com.amarmodi.jpa.hibernate.transactional.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

    private final EntityManager entityManager;

    public CourseRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Course findById(Long id){
        Course course = entityManager.find(Course.class, id);
        return course;
    }

    public Course save(Course course){ //Want to be able to insert or update a course

        if(course.getId() == null){
//            insert
            entityManager.persist(course);
        } else{
            entityManager.merge(course);
        }

        return course;
    }


    public void deleteById(Long Id){
        Course entity = this.findById(Id);
        this.entityManager.remove(entity);
    }

    public void playWithEntityManager(){
        Course course = new Course("Web Services in 100 steps");
        entityManager.persist(course);
        course.setName("Web Services in 100 steps - Updated");
    }
}
