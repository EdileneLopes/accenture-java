package com.accenture.cadastro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	long id;
	double notaProva1;
	double notaProva2;
	double notaTrabalho;
	double notaApresentacao;

	@OneToMany
	@JsonIgnoreProperties("notas")
	List<Disciplina> disciplina;

	public double calcularMedia(double notaProva1, double notaProva2, double notaTrabalho, double notaApresentacao) {
		return (notaProva1 + notaProva2 + notaApresentacao + notaTrabalho) / 4;
	}

	public String verificarAprovacao(Notas notas) {
		String conceito = "reprovado";
		double media = calcularMedia(notas.notaProva1, notas.notaProva2, notas.notaTrabalho, notas.notaApresentacao);
		if (media >= 9) {
			conceito = "A";
		}
		if (8 <= media && media < 9) {
			conceito = "B";
		}
		if (7 <= media && media < 9) {
			conceito = "C";
		}
		if (6 <= media && media < 7) {
			conceito = "D";
		}

		return " está " + conceito + ".";
	}

}
