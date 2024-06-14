package com.example.projeto.model;

import jakarta.persistence.*;

@Table(name = "RECEITA")
@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IdMedico")
    public Medico medico;

    @ManyToOne
    @JoinColumn(name = "IdPaciente")
    public Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "IdMedicamentoXReceita")
    public MedicamentoXReceita medicamentoXReceita;


    public Long getIdReceita() {
        return id;
    }

    public void setIdReceita(Long id) {
        this.id = id;
    }
}
