package com.example.projeto.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "FARMACIA")
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String Cnpj;

    @Column
    public String Nome;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        this.Cnpj = cnpj;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmacia farmacia = (Farmacia) o;
        return Cnpj == farmacia.Cnpj && Objects.equals(Id, farmacia.Id) && Objects.equals(Nome, farmacia.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Nome, Cnpj);
    }
}
