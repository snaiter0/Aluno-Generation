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

import com.LojadeGames.LojadeGames.Model.Produto;
import com.LojadeGames.LojadeGames.Repository.ProdutoRepository;

@RestController
@RequestMapping("/Produtos")
@CrossOrigin("*")
public class ProdutosController 
{
	
@Autowired ProdutoRepository Repositorio;
	
	
	@GetMapping("/Pesquisa/Nome/{PegaNome}")
	public ResponseEntity<List<Produto>> GetNome (@PathVariable(value = "PegaNome") String PegaNome)
	{
		return ResponseEntity.status(201).body(Repositorio.findAllByDescricaoIgnoreCaseContaining(PegaNome));
	}
	
	@GetMapping("/Pesquisa/Descricao/{PegaPegaDescricao}")
	public ResponseEntity<List<Produto>> GetDescricao (@PathVariable(value = "PegaDescricao") String PegaDescricao)
	{
		return ResponseEntity.status(201).body(Repositorio.findAllByDescricaoIgnoreCaseContaining(PegaDescricao));
	}
	
	@GetMapping("/Pesquisa/PegaTodos")
	public ResponseEntity<List<Produto>> GetTodos ()
	{
		return ResponseEntity.status(201).body(Repositorio.findAll());
	}
	
	@GetMapping("/Pesquisa/ID/{PegaId}")
	public ResponseEntity<Optional<Produto>> GetNome (@PathVariable(value = "PegaId") Long PegaId)
	{
		return ResponseEntity.status(201).body(Repositorio.findById(PegaId));
	}

	@PostMapping("/Salvar")
	public ResponseEntity<Produto> Salvar(@Valid @RequestBody Produto NovaCategoria)
	{
		return ResponseEntity.status(201).body(Repositorio.save(NovaCategoria));
	}
	
	@PutMapping("/Atualizar/{IDSolicitado}")
	public ResponseEntity<Produto> Atualiza(@Valid @RequestBody Produto AtualizaCategoria,@PathVariable(value = "IDSolicitado") Long IDSolicitado)
	{	
		if(Repositorio.existsById(IDSolicitado)!=false && AtualizaCategoria.getID()==IDSolicitado)
		{
			return ResponseEntity.status(202).body(Repositorio.save(AtualizaCategoria));
		}
		else
		{
			return ResponseEntity.status(203).build();
		}
	}
	@DeleteMapping("/Delete/{IDDelete}")
	public void Delete(@PathVariable(value = "IDDelete")Long IDDelete)
	{
		Repositorio.deleteById(IDDelete);
	}
}

	

