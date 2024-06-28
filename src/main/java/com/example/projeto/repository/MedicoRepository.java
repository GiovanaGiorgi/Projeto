package com.example.projeto.repository;

import com.example.projeto.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {

    @Query("SELECT m FROM Medico m")

    List<Medico> findAll();
}
