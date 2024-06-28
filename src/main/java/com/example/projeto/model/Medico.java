package com.example.projeto.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "MEDICO")
public class Medico extends Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String Nome;

    @Getter
    @Setter
    @Column
    private String Crm;

    @Getter
    @Setter
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Receita> listaDeReceitas;

    public Long getIdMedico() {
        return Id;
    }

    public void setIdMedico(Long idMedico) {
        Id = idMedico;
    }

    public String getNomeMedico() {
        return Nome;
    }

    public void setNomeMedico(String nomeMedico) {
        Nome = nomeMedico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Medico medico = (Medico) o;
        return Crm == medico.Crm && Objects.equals(Id, medico.Id) && Objects.equals(Nome, medico.Nome)
                && Objects.equals(listaDeReceitas, medico.listaDeReceitas) &&
                Objects.equals(email, medico.email) && Objects.equals(senha, medico.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Nome, Crm, listaDeReceitas, email, senha);
    }
}
