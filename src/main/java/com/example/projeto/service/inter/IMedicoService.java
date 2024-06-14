package com.example.projeto.service.inter;
import com.example.projeto.model.Medico;

import java.util.List;


public interface IMedicoService {

    public void cadastrarMedico(Medico medico);

    List<Medico> ListarMedico();

    public void excluirMedico(int id);

    public void alterarMedico(Medico medico);
}