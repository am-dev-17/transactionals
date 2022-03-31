package com.amarmodi.jpa.hibernate.transactional.model.manymany;

import com.amarmodi.jpa.hibernate.transactional.model.Student;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class CourseManyMany {
    @Id
    Long id;

    @ManyToMany(mappedBy = "likedCourses")
    Set<StudentManyMany> likes;
}
