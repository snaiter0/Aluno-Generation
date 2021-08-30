package com.ecommerce.ecommerce.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.Repository.CategoriaRepository;
import com.ecommerce.ecommerce.model.Categoria;


@RestController
@RequestMapping("/Categorias")
@CrossOrigin("*")
public class EcommerceController 
{

@Autowired CategoriaRepository Repositorio;
	
	@PostMapping("/Salvar") 
	public ResponseEntity<@Valid Categoria> SalvarCategoria(@Valid @RequestBody Categoria NovaCategoria)
	{
		return ResponseEntity.status(201).body(Repositorio.save(NovaCategoria));
		
	}
	
	@GetMapping("/Todes")
	public ResponseEntity<List<Categoria>> BuscarTodes()
	{
		return ResponseEntity.status(200).body(Repositorio.findAll());
	}
}
