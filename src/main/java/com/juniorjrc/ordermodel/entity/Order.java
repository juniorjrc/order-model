package com.juniorjrc.ordermodel.entity;

import com.juniorjrc.ordermodel.enums.OrderStatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static com.juniorjrc.ordermodel.enums.OrderStatusEnum.PENDING;

@Table(name = "ORDERS")
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @Column(name = "ORDER_VALUE")
    private BigDecimal orderValue;

    @Column(name = "ORDER_FINAL_VALUE")
    private BigDecimal orderFinalValue;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status;

    @Column(name = "ERROR_DETAILS")
    private String errorDetails;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PRODUCT_ORDER", joinColumns =
            {@JoinColumn(name = "ORDER_ID")}, inverseJoinColumns =
            {@JoinColumn(name = "PRODUCT_ID")})
    private List<Product> products;

    @Column(name = "CREATED_AT", columnDefinition = "DATETIME")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", columnDefinition = "DATETIME")
    private LocalDateTime updatedAt;

    private Order(final Customer customer,
                  final List<Product> products,
                  final OrderStatusEnum status) {
        this.customer = customer;
        this.products = products;
        this.createdAt = LocalDateTime.now();
        this.status = status;
    }

    public static Order createNewOrder(final Customer customer,
                                       final List<Product> products) {
        return new Order(customer, products, PENDING);
    }

    public Order updateOrderStatus(final OrderStatusEnum status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
        return this;
    }

    public Order updateOrderValues(final BigDecimal orderValue,
                                  final BigDecimal orderFinalValue,
                                  final OrderStatusEnum status) {
        this.orderValue = orderValue;
        this.orderFinalValue = orderFinalValue;
        this.status = status;
        this.updatedAt = LocalDateTime.now();
        return this;
    }
}
