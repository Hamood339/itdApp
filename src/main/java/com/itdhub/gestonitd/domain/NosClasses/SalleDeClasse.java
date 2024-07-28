package com.itdhub.gestonitd.domain.NosClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class SalleDeClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    @Size(max = 255)
    private String location;

    @NotNull
    private Integer capacity;

    @Size(max = 255)
    private String equipment;
    // Getters and setters

}
