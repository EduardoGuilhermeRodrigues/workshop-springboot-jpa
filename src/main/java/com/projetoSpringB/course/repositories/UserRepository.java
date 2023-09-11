package com.projetoSpringB.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringB.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
