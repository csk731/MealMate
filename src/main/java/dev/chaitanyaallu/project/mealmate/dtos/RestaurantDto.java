package dev.chaitanyaallu.project.mealmate.dtos;

import dev.chaitanyaallu.project.mealmate.models.Address;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Embeddable
public class RestaurantDto {
    private UUID id;
    private String nameOfTheRestaurant;
    private String description;
    @OneToOne
    private Address address;
}
