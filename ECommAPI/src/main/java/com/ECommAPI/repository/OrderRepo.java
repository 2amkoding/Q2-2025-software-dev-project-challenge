package com.ECommAPI.repository;

import com.ECommAPI.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderRepo extends JpaRepository<Order, UUID> {

    List<Order> findByOrderID(UUID orderID);

}
