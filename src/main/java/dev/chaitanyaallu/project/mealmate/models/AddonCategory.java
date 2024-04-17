package dev.chaitanyaallu.project.mealmate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddonCategory extends BaseModel{
    private String name;
    private String description;
    @OneToMany(mappedBy = "addonCategory", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<AddonItems> addonItems;
    @ManyToOne
    private Food food;
    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;
}
