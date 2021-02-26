package com.accenture.cadastro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.accenture.cadastro.model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
	public List<Disciplina> findAllByNomeContainingIgnoreCase(String nomeDisciplina);
}
