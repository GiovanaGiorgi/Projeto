package com.example.projeto.service.inter;

import com.example.projeto.model.Farmacia;
import com.example.projeto.model.Medico;
import com.example.projeto.model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    Optional<Usuario> loginMedico(String email, String senha);
    Optional<Usuario> loginFarmacia(String email, String senha);

}

