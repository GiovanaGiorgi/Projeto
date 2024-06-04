package com.example.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MEDICAMENTO")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    public String Nome;

    @Column
    public String Dosagem;

    @Column
    public String ViaAdm;


}
