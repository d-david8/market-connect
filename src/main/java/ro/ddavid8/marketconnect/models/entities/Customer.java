package ro.ddavid8.marketconnect.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "first_name")
    private String firstName;
    @NotBlank
    @Column(name = "last_name")
    private String lastName;
    @NotBlank
    @Column(name = "email", unique = true)
    private String email;
    @NotBlank
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @NotBlank
    @Column(name = "address")
    private String address;
    @ManyToMany
    @JoinTable(
            name = "favorite_products",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> favoriteProducts;
    @ManyToMany
    @JoinTable(
            name = "favorite_vendors",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "vendor_id")
    )
    private Set<Vendor> favoriteVendors;
    @OneToMany
    private Set<Order> orders;
    @OneToMany
    private Set<Review> reviews;
}