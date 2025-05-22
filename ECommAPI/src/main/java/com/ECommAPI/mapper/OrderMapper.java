package com.ECommAPI.mapper;

import com.ECommAPI.dto.OrderDTO;
import com.ECommAPI.entity.Order;
import com.ECommAPI.service.OrderService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.mapstruct.Mapping;


@Mapper(componentModel="spring")
public interface OrderMapper {


    @Mapping(target = "orderID", source = "orderID")
    public OrderDTO orderToDTO(Order order);

    @Mapping(target = "orderID", source = "orderID")
    public Order DTOToOrder(OrderDTO orderDTO);

}
