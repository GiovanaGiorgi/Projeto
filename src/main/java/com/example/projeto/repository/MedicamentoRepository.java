package com.example.projeto.repository;

import com.example.projeto.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

        @Query("SELECT m FROM Medicamento m")
        List<Medicamento> findAll();
    }