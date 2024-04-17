package dev.chaitanyaallu.project.mealmate.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItem extends BaseModel{
    @ManyToOne
    private Cart cart;
    private int itemQuantity;
    private Long price;
    @OneToOne
    private Food food;
    @ElementCollection
    private List<String> addOns;
}