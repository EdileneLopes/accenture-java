package com.accenture.cadastro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.cadastro.model.Notas;

@Repository
public interface NotasRepository extends JpaRepository<Notas, Long> {

}