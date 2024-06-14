package com.example.projeto.service.inter;

import com.example.projeto.model.Paciente;

import java.util.List;

public interface IPacienteService {

    public void cadastrarPaciente(Paciente paciente);

    List<Paciente> ListarPaciente();

    public void excluirPaciente(int id);

    public void alterarPaciente(Paciente paciente);
}
