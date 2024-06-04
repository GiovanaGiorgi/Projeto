package com.example.projeto.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "MEDICAMENTOXRECEITA")
public class MedicamentoXReceita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinColumn(name = "IdMedicamento")
    public List<Medicamento> medicamentos;

    @Column
    public String Quantidade;

    @Column
    public String Obs;


}
