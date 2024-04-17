package dev.chaitanyaallu.project.mealmate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.chaitanyaallu.project.mealmate.dtos.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_user")
public class User extends BaseModel{
    private String firstName;
    private String lastName;
    private int age;
    private String mobileNumber;
    private Date dateOfBirth;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Address> addresses;

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    // Cascade All might not be a good idea
    private List<Order> orders;
    @Enumerated
    private USER_STATUS userStatus;

    @ElementCollection
    private List<RestaurantDto> favouriteRestaurants;

    private String email;
    private String password;
    @Enumerated
    private USER_ROLE userRole;
}
