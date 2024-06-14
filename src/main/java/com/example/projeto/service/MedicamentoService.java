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
    public void cadastrarMedicamento(Medicamento medicamento) {
        if((medicamento.getNomeMedicamento() == null) || medicamento.getNomeMedicamento().isEmpty()){
            return;
        }
        if ((medicamento.getDosagem() == null || medicamento.getDosagem().isEmpty())) {
            return;
        }
        if ((medicamento.getViaAdm() == null) || medicamento.getViaAdm().isEmpty()) {
            return;
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
            return;
        }
        medicamentoRepository.save(medicamento);
    }

    @Override
    public void excluirMedicamento(int id) {
        if(id <= 0){
            return;
        }

        medicamentoRepository.deleteById(id);
    }


}
