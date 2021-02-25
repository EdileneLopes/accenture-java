package com.accenture.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.cadastro.model.CursoModel;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {

}
