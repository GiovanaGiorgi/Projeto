package com.example.projeto.service;

import com.example.projeto.model.Medicamento;
import com.example.projeto.repository.MedicamentoRepository;
import com.example.projeto.service.inter.IMedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService implements IMedicamentoService {

    @Autowired
     private MedicamentoRepository medicamentoRepository;

    @Override
    public Medicamento buscarPorId(int id) {
        return medicamentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Medicamento não encontrado."));
    }

    @Override
    public void cadastrarMedicamento(Medicamento medicamento) {
        if(medicamento.getNomeMedicamento() == null || medicamento.getDosagem() == null || medicamento.getViaAdm() == null){
            throw new IllegalArgumentException("Informe todos os dados necessários.");
        }
        medicamentoRepository.save(medicamento);
    }
    @Override
    public List<Medicamento> listarMedicamento() {
        return medicamentoRepository.findAll();
    }
    @Override
    public void alterarMedicamento(Medicamento medicamento) {
        if(medicamento.getNomeMedicamento() == null){
            throw new IllegalArgumentException("Informe o campo necessário.");
        }
        medicamentoRepository.save(medicamento);
    }

    @Override
    public void excluirMedicamento(int id) {
        if(id <= 0){
            throw new IllegalArgumentException("Valor inválido.");
        }

        medicamentoRepository.deleteById(id);
    }


}
