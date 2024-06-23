package com.example.projeto.repository;
import com.example.projeto.model.Usuario;
import com.example.projeto.model.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmailAndTipoUsuario(String email, TipoUsuario tipoUsuario);
}
