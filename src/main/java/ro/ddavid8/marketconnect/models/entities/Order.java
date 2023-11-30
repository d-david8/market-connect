package ro.ddavid8.marketconnect.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "address")
    private String address;
    @Column(name="order_value")
    private double orderValue;

}
