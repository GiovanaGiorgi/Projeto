package com.example.projeto.service;

import com.example.projeto.model.TipoUsuario;
import com.example.projeto.model.Usuario;
import com.example.projeto.repository.UsuarioRepository;
import com.example.projeto.service.inter.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> loginMedico(String email, String senha) {
        return usuarioRepository.findByEmailAndTipoUsuario(email, TipoUsuario.MEDICO)
                .filter(usuario -> usuario.getEmail().equals(email) && usuario.getSenha().equals(senha));
    }

    @Override
    public Optional<Usuario> loginFarmacia(String email, String senha) {
        return usuarioRepository.findByEmailAndTipoUsuario(email, TipoUsuario.FARMACIA)
                .filter(usuario -> usuario.getEmail().equals(email) && usuario.getSenha().equals(senha));
    }
}
