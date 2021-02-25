package com.accenture.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.accenture.cadastro.model.Curso;
import com.accenture.cadastro.repository.CursoRepository ;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	@Autowired
	private CursoRepository  cursoRepository;
 
	@GetMapping
	public  List<Curso> listar() {
	return cursoRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Curso> post(@RequestBody Curso curso){
		return ResponseEntity.status(HttpStatus.CREATED).body(cursoRepository.save(curso));
	}
}
