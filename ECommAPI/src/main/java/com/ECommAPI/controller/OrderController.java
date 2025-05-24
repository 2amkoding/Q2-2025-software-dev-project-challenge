package com.ECommAPI.controller;

import com.ECommAPI.dto.OrderDTO;
import com.ECommAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*") // Allow requests from any origin for development
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> findOrderByID(@PathVariable UUID id) {
        return orderService.findOrderByID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAllOrders() {
        List<OrderDTO> orders = orderService.findAllOrders();
        return ResponseEntity.ok(orders);
    }


}
