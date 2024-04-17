package dev.chaitanyaallu.project.mealmate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodCategory extends BaseModel{
    private String name;
    private String description;
    @ManyToOne
    private Restaurant restaurant;
    @OneToMany(mappedBy = "foodCategory")
    private List<Food> foods;
}
