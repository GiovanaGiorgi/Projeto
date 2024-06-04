package com.example.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FARMACIA")
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String cnpj;

    public Farmacia() {

    }
}
