package com.amarmodi.jpa.hibernate.transactional.model.manymany;

import com.amarmodi.jpa.hibernate.transactional.model.Course;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class StudentManyMany {
    @Id
    Long id;

    @ManyToMany
    @JoinTable(
            name = "course_like",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> likedCourses;

}
