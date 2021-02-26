package com.accenture.cadastro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_disciplina")
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String nome;
	double notaProva1;
	double notaProva2;
	double notaTrabalho;
	double notaApresentacao;
	
	@ManyToMany
	@JsonIgnoreProperties("curso")
	List<Curso> curso;
	
	public Disciplina() {
		
	}
	

}
