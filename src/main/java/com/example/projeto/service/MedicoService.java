package com.example.projeto.service;
import com.example.projeto.model.Medico;
import com.example.projeto.repository.MedicoRepository;
import com.example.projeto.service.inter.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicoService implements IMedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public void cadastrarMedico (Medico medico) {
        if((medico.getNomeMedico() == null) || medico.getNomeMedico().isEmpty()){
            return;
        }
        if ((medico.getCrm() == null || medico.getCrm().isEmpty())) {
            return;
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
            return;
        }

        medicoRepository.deleteById(id);
    }

    @Override
    public void alterarMedico(Medico medico) {
        if(medico.getIdMedico() == null){
            return;
        }
        medicoRepository.save(medico);
    }


}