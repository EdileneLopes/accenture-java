package com.accenture.cadastro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(nullable =  false)
	String nome;
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("curso")
	List<Aluno> aluno;
	
	@ManyToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("curso")
	List<Disciplina> disciplina;
}

