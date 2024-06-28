package com.example.projeto.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

//classe de "transição" - vai conter as informações de paciente e só, não é um ususário que vai ter ações.
//o médico pode cadastrar um paciente antes de criar uma receita. o mesmo vale para a classe de medicamento
@Entity
@Table(name = "PACIENTE")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String Nome;
    @Column
    public String Cpf;
    @Column
    public Date Nascimento;

    public Long getIdPaciente() {
        return Id;
    }

    public void setIdPaciente(Long id) {
        Id = id;
    }

    public String getNomePaciente() {
        return Nome;
    }

    public void setNomePaciente(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date nascimento) {
        Nascimento = nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(Id, paciente.Id) &&
                Objects.equals(Cpf, paciente.Cpf) &&
                Objects.equals(Nascimento, paciente.Nascimento) &&
                Objects.equals(Nome, paciente.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Cpf, Nascimento, Nome);
    }

}
