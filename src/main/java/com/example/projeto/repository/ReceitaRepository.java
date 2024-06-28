package com.example.projeto.repository;

import com.example.projeto.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
    @Query("SELECT r FROM Receita r")
    List<Receita> findAll();
}