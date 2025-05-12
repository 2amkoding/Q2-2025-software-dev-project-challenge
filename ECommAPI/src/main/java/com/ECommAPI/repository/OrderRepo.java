package com.ECommAPI.repository;

import com.ECommAPI.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepo extends JpaRepository<Order, UUID> {

    Optional<Order> findByOrderID(UUID orderID);

}
