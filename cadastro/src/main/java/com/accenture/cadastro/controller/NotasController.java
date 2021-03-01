package com.accenture.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.cadastro.model.Aluno;
import com.accenture.cadastro.model.Notas;
import com.accenture.cadastro.repository.NotasRepository;

@RestController
@RequestMapping("/notas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotasController {
	@Autowired
	public NotasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Notas>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Notas> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Notas> post(@RequestBody Notas notas){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(notas));
	}
	
	@PutMapping
	public ResponseEntity<Notas> put(@RequestBody Notas notas){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(notas));
	}
		
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}

