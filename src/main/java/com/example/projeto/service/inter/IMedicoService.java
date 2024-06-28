package com.example.projeto.service.inter;
import com.example.projeto.model.Medico;
import com.example.projeto.model.Receita;

import java.util.List;


public interface IMedicoService {

    Receita emitirReceita(int pacienteId, int medicamentoId);

    public void cadastrarMedico(Medico medico);

    List<Medico> ListarMedico();

    public void excluirMedico(int id);

    public void alterarMedico(Medico medico);
}