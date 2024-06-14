package com.example.projeto.service.inter;

import com.example.projeto.model.Farmacia;

import java.util.List;

public interface IFarmaciaService {

    public void cadastrarFarmacia(Farmacia farmacia);
    public List<Farmacia> listarFarmacia();
    public void excluirFarmacia(int id);
    public void alterarFarmacia(Farmacia farmacia);

}
