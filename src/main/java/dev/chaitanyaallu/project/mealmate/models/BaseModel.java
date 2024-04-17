package dev.chaitanyaallu.project.mealmate.models;


import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@MappedSuperclass
public class BaseModel {
    @UuidGenerator
    @Id
    private UUID id;
}
