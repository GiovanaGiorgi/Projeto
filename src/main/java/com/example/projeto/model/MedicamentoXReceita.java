package com.example.projeto.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "MEDICAMENTOXRECEITA")
public class MedicamentoXReceita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToMany
    @JoinColumn(name = "IdMedicamento")
    public List<Medicamento> medicamentos;

    @Column
    public String Quantidade;

    @Column
    public String Obs;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String quantidade) {
        Quantidade = quantidade;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String obs) {
        Obs = obs;
    }
}
