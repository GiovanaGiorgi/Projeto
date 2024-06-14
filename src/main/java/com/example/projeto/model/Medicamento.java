package com.example.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MEDICAMENTO")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String Nome;

    @Column
    public String Dosagem;

    @Column
    public String ViaAdm;

    public long getIdMedicamento() {
        return Id;
    }

    public void setIdMedicamento(Long id) {
        Id = id;
    }

    public String getNomeMedicamento() {
        return Nome;
    }

    public void setNomeMedicamento(String nome) {
        Nome = nome;
    }

    public String getDosagem() {
        return Dosagem;
    }

    public void setDosagem(String dosagem) {
        Dosagem = dosagem;
    }

    public String getViaAdm() {
        return ViaAdm;
    }

    public void setViaAdm(String viaAdm) {
        ViaAdm = viaAdm;
    }
}
