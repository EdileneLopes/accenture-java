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
@Table(name = "tb_disciplina")


public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String nomeDisciplina;
	public double notaProva1;
	public double notaProva2;
	public double notaTrabalho;
	public double notaApresentacao;
	
	public Disciplina() {
		
	}
	

}
