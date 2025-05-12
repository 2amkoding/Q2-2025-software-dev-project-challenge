package com.ECommAPI.service;

import com.ECommAPI.dto.OrderDTO;
import com.ECommAPI.mapper.OrderMapper;
import com.ECommAPI.repository.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepo orderRepo, OrderMapper ordermapper) {
        this.orderRepo = orderRepo;
        this.orderMapper = ordermapper;
    }

    public Optional<OrderDTO> findOrderByID(UUID id) {
        return orderRepo.findByOrderID(id)
                .map(orderMapper::orderToDTO);
    }

}
