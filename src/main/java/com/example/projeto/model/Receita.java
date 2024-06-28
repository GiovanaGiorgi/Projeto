package com.example.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate; // Importa LocalDate para lidar com datas
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "RECEITA")
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "IdMedico")
    private Medico medico;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "IdPaciente")
    private Paciente paciente;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "IdMedicamento")
    private Medicamento medicamento;

    @Setter
    @Getter
    @Column(name = "data_emissao")
    private LocalDate dataEmissao;

    @Getter
    @Setter
    @Column(name = "validade")
    private LocalDate validade;

    @Setter
    @Getter
    @Column(name = "data_utilizacao")
    private LocalDate dataUtilizacao;

    @Setter
    @Getter
    @Column(name = "quantidade")
    private String quantidade;

    @Getter
    @Setter
    @Column(name = "obs")
    private String obs;

    @Getter
    @Setter
    @Column(name = "Invalida")
    private Boolean Invalida = false;

    public Receita() {}

    public Long getIdReceita() {
        return Id;
    }

    public void setIdReceita(Long Id) {
        this.Id = Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Receita receita = (Receita) o;
        return Objects.equals(Id, receita.Id) &&
                Objects.equals(medico, receita.medico) &&
                Objects.equals(paciente, receita.paciente) &&
                Objects.equals(medicamento, receita.medicamento) &&
                Objects.equals(dataEmissao, receita.dataEmissao) &&
                Objects.equals(validade, receita.validade) &&
                Objects.equals(dataUtilizacao, receita.dataUtilizacao)
                && Objects.equals(quantidade, receita.quantidade)
                && Objects.equals(obs, receita.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, medico, paciente, medicamento, dataEmissao, validade, dataUtilizacao, quantidade, obs);
    }

}
