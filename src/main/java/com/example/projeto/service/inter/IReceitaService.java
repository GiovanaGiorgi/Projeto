package com.example.projeto.service.inter;

import com.example.projeto.model.Receita;

import java.util.List;

public interface IReceitaService {

    public List<Receita> listarReceita();
    public void cadastrarReceita(Receita receita);
    public void excluirReceita(int id);
    public void alterarReceita(Receita receita);

}
