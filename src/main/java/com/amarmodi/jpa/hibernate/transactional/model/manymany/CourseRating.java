package com.amarmodi.jpa.hibernate.transactional.model.manymany;

import com.amarmodi.jpa.hibernate.transactional.model.Course;
import com.amarmodi.jpa.hibernate.transactional.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Data
@AllArgsConstructor
public class CourseRating {

    @EmbeddedId
    CourseRatingKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    Course course;

    int rating;

    class Student {

        // ...

        @OneToMany(mappedBy = "student")
        Set<CourseRating> ratings;

        // ...
    }

    class Course {

        // ...

        @OneToMany(mappedBy = "course")
        Set<CourseRating> ratings;

        // ...
    }
}
