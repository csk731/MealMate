package dev.chaitanyaallu.project.mealmate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant extends BaseModel{
    private String name;
    private String description;
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Food> foods;
    @OneToOne
    private User owner;
    private RESTAURANT_STATUS restaurantStatus;
    private CUISINE_TYPE cuisineType;
    @Column(length = 1000)
    @ElementCollection
    private List<String> images;
    private LocalDateTime registrationDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    @JsonIgnore
    private List<Order> orders;
    private LocalTime opensAt;
    private LocalTime closesAt;
    @Embedded
    private ContactInformation ContactInfo;
}
