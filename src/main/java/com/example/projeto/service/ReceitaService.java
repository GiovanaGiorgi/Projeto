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
    public Receita cadastrarReceita(Receita receita) {
        if(receita.getMedico() == null || receita.getObs() == null || receita.getValidade() == null ||
        receita.getPaciente() == null || receita.getMedicamento() == null || receita.getQuantidade() == null ) {
            throw new IllegalArgumentException("Informe todos os dados necessários.");
        }
        receitaRepository.save(receita);
        return receita;
    }

    @Override
    public void excluirReceita(int id) {
        if(id <= 0){
            throw new IllegalArgumentException("Valor inválido.");
        }
        receitaRepository.deleteById(id);
    }

    @Override
    public void alterarReceita(Receita receita) {
        if (receita.getIdReceita() == null){
            throw new IllegalArgumentException("Informe o campo necessário.");
        }
        receitaRepository.save(receita);
    }
}
