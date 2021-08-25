package org.generation.BlogPessoal.controller;

import java.util.List;

import org.generation.BlogPessoal.Model.Postagem;
import org.generation.BlogPessoal.Repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Postagens")
@CrossOrigin("*")
public class PostagemController 
{
	@Autowired
	private PostagemRepository Repository;
	
	
	@GetMapping()
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(Repository.findAll());
	}
}
