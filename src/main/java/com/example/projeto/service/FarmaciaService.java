package com.example.projeto.service;

import com.example.projeto.model.Farmacia;
import com.example.projeto.model.Receita;
import com.example.projeto.repository.FarmaciaRepository;
import com.example.projeto.repository.ReceitaRepository;
import com.example.projeto.service.inter.IFarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaService implements IFarmaciaService {

    @Autowired
    private FarmaciaRepository farmaciaRepository;
    @Autowired
    private ReceitaRepository receitaRepository;


    public void realizarCheckout(int receitaId) {
        Receita receita = receitaRepository.findById(receitaId)
                .orElseThrow(() -> new IllegalArgumentException("Receita não encontrada para o ID fornecido."));

        receita.setInvalida(true);
        receitaRepository.save(receita);
    }

    @Override
    public void cadastrarFarmacia(Farmacia farmacia) {
        if (farmacia.getCnpj() == null || farmacia.getNome() == null){
            throw new IllegalArgumentException("Informe todos os dados necessários.");
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
            throw new IllegalArgumentException("Valor inválido.");
        }
        farmaciaRepository.deleteById(id);
    }

    @Override
    public void alterarFarmacia(Farmacia farmacia) {
        if(farmacia.getId() == null){
            throw new IllegalArgumentException("Informe o campo necessário.");
        }
        farmaciaRepository.save(farmacia);
    }

}
