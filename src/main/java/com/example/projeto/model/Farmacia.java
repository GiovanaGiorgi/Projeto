package com.example.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FARMACIA")
public class Farmacia extends Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String CNPJ;

    public Farmacia(String email, String senha){
        super(email, senha);
    }

    public Farmacia() {

    }
}
