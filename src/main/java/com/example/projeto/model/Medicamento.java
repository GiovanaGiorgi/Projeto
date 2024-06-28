package com.example.projeto.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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

    @ManyToMany(mappedBy = "medicamentos")
    public Set<Receita> receita;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Medicamento medicamento = (Medicamento) o;
        return Objects.equals(Id, medicamento.Id) &&
                Objects.equals(Dosagem, medicamento.Dosagem) &&
                Objects.equals(Nome, medicamento.Nome) &&
                Objects.equals(ViaAdm, medicamento.ViaAdm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Dosagem, Nome, ViaAdm);
    }

}
