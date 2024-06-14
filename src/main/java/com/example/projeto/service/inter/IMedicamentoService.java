package com.example.projeto.service.inter;

import com.example.projeto.model.Medicamento;

import java.util.List;

public interface IMedicamentoService {
    public void cadastrarMedicamento(Medicamento medicamento);
    public void alterarMedicamento(Medicamento medicamento);
    public void excluirMedicamento(int id);
    public List<Medicamento> listarMedicamento();
}
