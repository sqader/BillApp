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
    public class ContractorModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nazwa")
        private String name;

        @OneToOne
        @JoinColumn(name = "adres")
        private AdressModel address;

        @Column(name = "nip")
        private String nip;

        @Column(name = "regon")
        private String regon;

        @Column(name = "email")
        private String email;

        @Column(name = "numer_telefonu")
        private String phoneNumber;
    }
