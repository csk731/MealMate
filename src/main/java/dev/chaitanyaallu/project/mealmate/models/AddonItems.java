package dev.chaitanyaallu.project.mealmate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddonItems extends BaseModel{
    private String name;
    private String description;
    private Long price;
    @ManyToOne
    private Food food;
    @ManyToOne
    private AddonCategory addonCategory;
    private FOOD_ITEM_AVAILABILITY itemAvailability;
}
