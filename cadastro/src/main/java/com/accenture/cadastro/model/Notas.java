package com.accenture.cadastro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_notas")
public class Notas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;;
	double notaProva1;
	double notaProva2;
	double notaTrabalho;
	double notaApresentacao;
	
	@OneToMany
	List<Disciplina> disciplina;
	
	@OneToOne
	Aluno aluno;
}
