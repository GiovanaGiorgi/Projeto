package com.example.projeto.repository;

import com.example.projeto.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    @Query("SELECT p FROM Paciente p")
    List<Paciente> findAll();
}
