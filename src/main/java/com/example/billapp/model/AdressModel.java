package com.example.billapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ulica")
    private String street;

    @Column(name = "numer_domu")
    private String houseNumber;

    @Column(name = "numer_mieszkania")
    private String apartmentNumber;

    @Column(name = "kod_pocztowy")
    private String zipCode;

    @Column(name = "miasto")
    private String city;

}
