package com.example.projeto.model;


import jakarta.persistence.*;

import java.util.Date;

//classe de "transição" - vai conter as informações de paciente e só, não é um ususário que vai ter ações.
//o médico pode cadastrar um paciente antes de criar uma receita. o mesmo vale para a classe de medicamento
@Entity
@Table(name = "PACIENTE")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String nome;
    @Column
    public String cpf;
    @Column
    public Date nascimento;
}
