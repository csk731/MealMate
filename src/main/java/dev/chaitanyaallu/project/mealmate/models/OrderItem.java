package dev.chaitanyaallu.project.mealmate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseModel{
    private String name;
    private String description;
    @ManyToOne
    @JsonIgnore
    private Order order;
    @ManyToOne
    private Food food;
    // Why not List<AddonCategory>?
    @ElementCollection
    private List<String> addonCategories;
    private int quantity;
    private Long totalPrice;
}
