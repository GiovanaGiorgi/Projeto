package com.example.projeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MEDICO")
public class Medico extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    public String Nome;

    @Column
    public int CRM;
    //assinatura digital??

    public Medico(String email, String senha){
        super(email, senha);
    }


    public Medico() {

    }
}
