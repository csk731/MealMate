package dev.chaitanyaallu.project.mealmate.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactInformation{
    private String email;
    private String phoneNumber;
    private String twitter;
    private String facebook;
    private String instagram;
}
