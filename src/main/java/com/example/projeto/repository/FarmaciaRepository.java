package com.example.projeto.repository;

import com.example.projeto.model.Farmacia;
import com.example.projeto.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {
        @Query("SELECT f FROM Farmacia f")
         List<Farmacia> findAll();
}
