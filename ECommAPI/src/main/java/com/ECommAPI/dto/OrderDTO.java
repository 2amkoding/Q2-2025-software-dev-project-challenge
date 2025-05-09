public record OrderDTO {

    UUID orderID,
    LocalDateTime orderDate,
    Long userID,
    Long productID,
    Long quantity,
    BigDecimal price,
    BigDecimal totalAmount,
    String country,
    String city
}