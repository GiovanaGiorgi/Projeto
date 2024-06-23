package com.example.projeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Getter
    @Setter
    @Column(name = "Email")
    public String email;

    @Getter
    @Setter
    @Column(name = "Senha")
    public String senha;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "TipoUsuario")
    public TipoUsuario tipoUsuario;

    public Long getIdUsuario() {
        return Id;
    }

    public void setIdUsuario(Long id) {
        Id = id;
    }

}
