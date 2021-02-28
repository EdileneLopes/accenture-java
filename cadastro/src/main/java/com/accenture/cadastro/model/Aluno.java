package com.accenture.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	long id;
	String nome;
	String telefone;
	String matricula;
	String endereco;
	String cidade;
	String uf;
	String cep;
	
	@ManyToOne
	@JsonIgnoreProperties("aluno")
	Curso curso;

	public Aluno() {

	}

	public Aluno(String nome, String telefone, String matricula) {
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
	}
}
