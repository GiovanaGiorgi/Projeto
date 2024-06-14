package com.example.projeto.service;

import com.example.projeto.model.Medico;
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
        public void cadastrarPaciente (Paciente paciente) {
            if((paciente.getNomePaciente() == null) || paciente.getNomePaciente().isEmpty()){
                return;
            }
            if ((paciente.getCpf() == null )|| paciente.getCpf().isEmpty()){
            return;
            }
            if (paciente.getNascimento() == null){
                return;
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
                return;
            }

            pacienteRepository.deleteById(id);
        }

        @Override
        public void alterarPaciente (Paciente paciente) {
            if(paciente.getIdPaciente() == null){
                return;
            }
            pacienteRepository.save(paciente);
        }

    }
