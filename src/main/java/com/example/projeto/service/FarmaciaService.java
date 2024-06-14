package com.example.projeto.service;

import com.example.projeto.model.Farmacia;
import com.example.projeto.repository.FarmaciaRepository;
import com.example.projeto.service.inter.IFarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaService implements IFarmaciaService {

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    @Override
    public void cadastrarFarmacia(Farmacia farmacia) {
        if (farmacia.getNome() == null || farmacia.getNome().isEmpty()) {
            return;
        }
        if (farmacia.getCnpj() == null || farmacia.getCnpj().isEmpty()) {
            return;
        }
        farmaciaRepository.save(farmacia);
    }

    @Override
    public List<Farmacia> listarFarmacia() {
        return farmaciaRepository.findAll();
    }

    @Override
    public void excluirFarmacia(int id) {
        if(id <= 0){
            return;
        }
        farmaciaRepository.deleteById(id);
    }

    @Override
    public void alterarFarmacia(Farmacia farmacia) {
        if(farmacia.getId() == null){
            return;
        }
        farmaciaRepository.save(farmacia);
    }

}
