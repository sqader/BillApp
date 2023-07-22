package com.example.billapp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nazwa_firmy")
    private String nameCompany;

    @Column(name = "adres")
    private String address;

    @Column(name = "nip")
    private String nip;

    @Column(name = "regon")
    private String regon;

    @Column(name = "nr_konta")
    private String bankAccountNumber;


    @Column(name = "bank")
    private String bank;

    @Column(name = "numer_telefonu")
    private String telNumber;

}
