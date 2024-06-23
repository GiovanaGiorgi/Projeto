package com.example.projeto.service;
import com.example.projeto.model.Medicamento;
import com.example.projeto.model.Medico;
import com.example.projeto.model.Paciente;
import com.example.projeto.model.Receita;
import com.example.projeto.repository.MedicoRepository;
import com.example.projeto.service.inter.IMedicamentoService;
import com.example.projeto.service.inter.IMedicoService;
import com.example.projeto.service.inter.IPacienteService;
import com.example.projeto.service.inter.IReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class MedicoService implements IMedicoService {

    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private IMedicamentoService medicamentoService;
    @Autowired
    private IPacienteService pacienteService;
    @Autowired
    private IReceitaService receitaService;

    @Override
    public Receita emitirReceita(int pacienteId, int medicamentoId) {
        // Encontrar o paciente e o medicamento pelos seus IDs
        Paciente paciente = pacienteService.buscarPorId(pacienteId);
        Medicamento medicamento = medicamentoService.buscarPorId(medicamentoId);

        if (paciente == null || medicamento == null) {
            throw new IllegalArgumentException("Paciente ou medicamento não encontrado.");
        }

        Receita receita = new Receita();
        receita.setDataEmissao(LocalDate.now());
        receita.setPaciente(paciente);
        receita.setMedicamento(medicamento);
        Receita cadastrarReceita = receitaService.cadastrarReceita(receita);

        return cadastrarReceita;
    }

    @Override
    public void cadastrarMedico (Medico medico) {
        if(medico.getNomeMedico() == null || medico.getCrm() == null) {
            throw new IllegalArgumentException("Informe todos os dados necessários.");
        }
        medicoRepository.save(medico);
    }

    @Override
    public List<Medico> ListarMedico() {
        return medicoRepository.findAll();
    }


    @Override
    public void excluirMedico(int id) {
        if(id <= 0){
            throw new IllegalArgumentException("Valor inválido.");
        }
        medicoRepository.deleteById(id);
    }

    @Override
    public void alterarMedico(Medico medico) {
        if(medico.getIdMedico() == null){
            throw new IllegalArgumentException("Informe o campo necessário.");
        }
        medicoRepository.save(medico);
    }
}