package dev.chaitanyaallu.project.mealmate.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseModel{
    private int StreetNumber;
    private String streetName;
    private String houseOrApartmentNumber;
    private String ApartmentName;
    private String city;
    private String state;
    private String country;
    private String zipCode;

}
