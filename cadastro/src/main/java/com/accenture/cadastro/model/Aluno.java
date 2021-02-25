package com.accenture.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	int idade;
	String telefone;
	String matricula;
	String endereco;
	String cidade;
	String uf;
	String cep;

	public Aluno() {

	}

	public Aluno(String nome, int idade, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
}
