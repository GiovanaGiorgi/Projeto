package com.example.projeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Email")
    public String email;

    @Column(name = "Senha")
    public String senha;

    public Usuario(String email, String senha) {
    }
}
