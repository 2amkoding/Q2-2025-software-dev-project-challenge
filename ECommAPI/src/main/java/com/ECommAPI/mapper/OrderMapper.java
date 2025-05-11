package com.ECommAPI.mapper;

import com.ECommAPI.dto.OrderDTO;
import com.ECommAPI.entity.Order;
import com.ECommAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.xmlunit.util.Mapper;

@Mapper(componentModel="spring")
public abstract class OrderMapper {

    @Autowired
    protected OrderService orderService;

    public abstract OrderDTO orderToDTO(Order order);

    public abstract Order DTOToOrder(OrderDTO orderDTO)

}
