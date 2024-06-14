package com.example.projeto.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "MEDICO")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String Nome;

    @Column
    public String Crm;

    public Long getIdMedico() {
        return Id;
    }

    public void setIdMedico(Long idMedico) {
        this.Id = idMedico;
    }

    public String getCrm() {
        return Crm;
    }

    public void setCrm(String crm) {
        this.Crm = crm;
    }

    public String getNomeMedico() {
        return Nome;
    }

    public void setNomeMedico(String nome) {
        this.Nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
            return Crm == medico.Crm && Objects.equals(Id, medico.Id) && Objects.equals(Nome, medico.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Nome, Crm);
    }
}
