package com.example.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "FARMACIA")
public class Farmacia extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Getter
    @Setter
    @Column
    private String Cnpj;

    @Getter
    @Setter
    @Column
    private String Nome;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Farmacia farmacia = (Farmacia) o;
        return Cnpj == farmacia.Cnpj && Objects.equals(Id, farmacia.Id) && Objects.equals(Nome, farmacia.Nome) &&
                Objects.equals(email, farmacia.email) && Objects.equals(senha, farmacia.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Nome, Cnpj, email, senha);
    }
}
