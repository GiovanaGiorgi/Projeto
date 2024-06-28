package com.example.projeto.service;

import com.example.projeto.model.Paciente;
import com.example.projeto.repository.PacienteRepository;
import com.example.projeto.service.inter.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService {
        @Autowired
        private PacienteRepository pacienteRepository;


    @Override
    public Paciente buscarPorId(int id) {
        return pacienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Paciente não encontrado."));
    }

    @Override
        public void cadastrarPaciente (Paciente paciente) {
            if(paciente.getNomePaciente() == null || paciente.getNascimento() == null || paciente.getCpf() == null){
                throw new IllegalArgumentException("Informe todos os dados necessários.");
            }
            pacienteRepository.save(paciente);
        }

        @Override
        public List<Paciente> ListarPaciente() {
            return pacienteRepository.findAll();
        }


        @Override
        public void excluirPaciente(int id) {
            if(id <= 0){
                throw new IllegalArgumentException("Valor inválido.");
            }

            pacienteRepository.deleteById(id);
        }

        @Override
        public void alterarPaciente (Paciente paciente) {
            if(paciente.getIdPaciente() == null){
                throw new IllegalArgumentException("Informe o campo necessário.");
            }
            pacienteRepository.save(paciente);
        }

    }
