import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name="orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "order_id", updatable  = false, nullable = false, columnDefinition = "CHAR(36)")
    private UUID orderID;

    @CreationTimestamp
    @Column(name="order_date", nullable = false, updatable = false)
    private LocalDateTime orderDate;

    private Long userID;
    private Long productID;
    private Long quantity;
    private BigDecimal price;
    private BigDecimal totalAmount;
    private String country;
    private String city;
}