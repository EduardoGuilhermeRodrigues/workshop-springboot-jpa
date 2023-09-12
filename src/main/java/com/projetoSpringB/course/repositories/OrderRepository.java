package com.projetoSpringB.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringB.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
