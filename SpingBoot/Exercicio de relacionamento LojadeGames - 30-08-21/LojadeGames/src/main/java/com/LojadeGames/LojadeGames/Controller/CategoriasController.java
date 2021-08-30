package com.LojadeGames.LojadeGames.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.LojadeGames.LojadeGames.Model.Categorias;
import com.LojadeGames.LojadeGames.Repository.CategoriasRepository;

@RestController
@RequestMapping("/Categorias")
@CrossOrigin("*")
public class CategoriasController 
{
	@Autowired CategoriasRepository Repositorio;

	 
	@GetMapping("/Pesquisa/Nome/{PegaNome}")
	public ResponseEntity<List<Categorias>> GetNome_Categoria (@PathVariable(value = "PegaNome") String PegaNome)
	{
		return ResponseEntity.status(201).body(Repositorio.findAllByNomeCategoriaContainingIgnoreCase(PegaNome));
	}
	
	@GetMapping("/Pesquisa/Descricao/{PegaPegaDescricao}")
	public ResponseEntity<List<Categorias>> GetDescricao_Categoria (@PathVariable(value = "PegaDescricao") String PegaDescricao)
	{
		return ResponseEntity.status(201).body(Repositorio.findAllByNomeCategoriaContainingIgnoreCase(PegaDescricao));
	}
	
	@GetMapping("/Pesquisa/PegaTodos")
	public ResponseEntity<List<Categorias>> GetTodos_Categoria ()
	{
		return ResponseEntity.status(201).body(Repositorio.findAll());
	}
	
	@GetMapping("/Pesquisa/ID/{PegaId}")
	public ResponseEntity<Optional<Categorias>> GetNome_Categoria (@PathVariable(value = "PegaId") Long PegaId)
	{
		return ResponseEntity.status(201).body(Repositorio.findById(PegaId));
	}

	@PostMapping("/Salvar")
	public ResponseEntity<Categorias> Salvar_Categoria(@Valid @RequestBody Categorias NovaCategoria)
	{
		return ResponseEntity.status(201).body(Repositorio.save(NovaCategoria));
	}
	
	@PutMapping("/Atualizar/{IDSolicitado}")
	public ResponseEntity<Categorias> Atualiza_Categoria(@Valid @RequestBody Categorias AtualizaCategoria,@PathVariable(value = "IDSolicitado") Long IDSolicitado)
	{	
		if(Repositorio.existsById(IDSolicitado)!=false && AtualizaCategoria.getId()==IDSolicitado)
		{
			return ResponseEntity.status(202).body(Repositorio.save(AtualizaCategoria));
		}
		else
		{
			return ResponseEntity.status(203).build();
		}
	}
	@DeleteMapping("/Delete/{IDDelete}")
	public void Delete_Categoria(@PathVariable(value = "IDDelete")Long IDDelete)
	{
		Repositorio.deleteById(IDDelete);
	}
}
