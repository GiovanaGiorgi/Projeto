package com.example.projeto.model;

import jakarta.persistence.*;

public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    public String Nome;

    @Column
    public String Dosagem;

    @Column
    public String Quantidade;

    @Column
    public String ViaAdm;

    @Column
    public String Obs;


}
