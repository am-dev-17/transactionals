package com.amarmodi.jpa.hibernate.transactional.repositories;

import com.amarmodi.jpa.hibernate.transactional.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUserName(String userName);
}
