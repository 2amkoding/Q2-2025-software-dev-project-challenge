package com.ECommAPI.service;

import com.ECommAPI.dto.OrderDTO;
import com.ECommAPI.mapper.OrderMapper;
import com.ECommAPI.repository.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

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
    

    public List<OrderDTO> findAllOrders() {
        return orderRepo.findAll().stream()
                .map(orderMapper::orderToDTO)
                .collect(Collectors.toList());
    }

}
