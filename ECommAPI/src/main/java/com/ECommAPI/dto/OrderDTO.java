package com.ECommAPI.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record OrderDTO (

    UUID orderID,
    LocalDateTime orderDate,
    Long userID,
    Long productID,
    Long quantity,
    BigDecimal price,
    BigDecimal totalAmount,
    String country,
    String city
){}