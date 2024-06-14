package com.example.projeto.service;

import com.example.projeto.model.Receita;
import com.example.projeto.repository.ReceitaRepository;
import com.example.projeto.service.inter.IReceitaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService implements IReceitaService {

    private final ReceitaRepository receitaRepository;

    public ReceitaService(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    @Override
    public List<Receita> listarReceita() {
        return receitaRepository.findAll();
    }

    @Override
    public void cadastrarReceita(Receita receita) {
        if((receita.getIdReceita() == null) || (receita.getIdReceita().isEmpty())){
            return;
        }
        receitaRepository.save(receita);
    }

    @Override
    public void excluirReceita(int id) {
        if(id <= 0){
            return;
        }
        receitaRepository.deleteById(id);
    }

    @Override
    public void alterarReceita(Receita receita) {
        if (receita.getIdReceita() == null){
            return;
        }
        receitaRepository.save(receita);
    }
}
