package dev.chaitanyaallu.project.mealmate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order extends BaseModel{
    @OneToMany
    @JsonIgnore
    private List<OrderItem> orderItems;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User customer;

    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;
    private Date createdAt;
    private int itemQuantity;
    private ORDER_STATUS orderStatus;

    @ManyToOne
    private Address deliveryAddress;

    @ManyToOne
    private User deliveryPerson;
    private Date deliveredAt;
    private int totalItems;
    private Long totalAmount;
    //private List<Payment> payments;
}
