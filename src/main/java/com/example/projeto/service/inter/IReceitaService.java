package com.example.projeto.service.inter;

import com.example.projeto.model.Medicamento;
import com.example.projeto.model.Paciente;
import com.example.projeto.model.Receita;

import java.util.List;

public interface IReceitaService {

    public List<Receita> listarReceita();
    public Receita cadastrarReceita(Receita receita);
    public void excluirReceita(int id);
    public void alterarReceita(Receita receita);

}
