package com.accenture.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.cadastro.model.Disciplina;
import com.accenture.cadastro.repository.DisciplinaRepository;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class DisciplinaController {
	
	/*@Autowired
	public DisciplinaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Disciplina>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	
	
	}*/
}
