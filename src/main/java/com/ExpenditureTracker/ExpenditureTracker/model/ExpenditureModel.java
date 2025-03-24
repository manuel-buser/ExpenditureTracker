package com.ExpenditureTracker.ExpenditureTracker.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // Generates a no-args constructor
@AllArgsConstructor     // Generates a constructor with all fields as parameters
@Builder                // (Optional) Generates a builder pattern for creating instances
public class ExpenditureModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String description;
    private Double amount;
    private String category;
}
