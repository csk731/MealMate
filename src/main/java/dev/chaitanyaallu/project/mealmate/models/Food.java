package dev.chaitanyaallu.project.mealmate.models;

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
public class Food extends BaseModel{
    private String name;
    private String description;
    @ManyToOne
    private FoodCategory foodCategory;
    @ManyToOne
    private Restaurant restaurant;
    @ManyToMany
    List<AddonItems> addonItems;
    private FOOD_ITEM_AVAILABILITY foodAvailability;
    private FOOD_TYPE foodType;
    private int isSeasonal;
    @ElementCollection
    @Column(length = 1000)
    private List<String> images;
    private Long price;
    private Date createdAt;
}
