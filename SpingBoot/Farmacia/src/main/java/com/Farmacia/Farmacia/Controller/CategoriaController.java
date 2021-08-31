package com.Farmacia.Farmacia.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Farmacia.Farmacia.Model.Categoria;
import com.Farmacia.Farmacia.Repository.CategoriaRepository;

@RestController
@RequestMapping("/Categorias")
@CrossOrigin("*")
public class CategoriaController 
{
	
	@Autowired CategoriaRepository Repositorio;
	
	@GetMapping("/PegarTodos")
	public ResponseEntity<List<Categoria>> GetAllCategoria()
	{
		return ResponseEntity.status(200).body(Repositorio.findAll());
	}
	
	@PostMapping("/Salvar")
	public void SalvarCategoria(@Valid @RequestBody Categoria BodyCategoria)
	{
		ResponseEntity.status(201).body(Repositorio.save(BodyCategoria)); 
	}
	
	@GetMapping("/PegarCategoria/ID/{FindIdCat}")
	public ResponseEntity<Optional<Categoria>> FindCategoriaById(@PathVariable(value = "FindIdCat")Long FindIdCat)
	{
		return ResponseEntity.status(200).body(Repositorio.findById(FindIdCat));
	}

	@GetMapping("/Pesquisa/Descricao/{PegaDescricao}")
	public ResponseEntity<List<Categoria>> GetDescription_Produto (@PathVariable(value = "PegaDescricao") String PegaDescricao)
	{	
		List<Categoria> ObjetoProduto = Repositorio.findAllBydescricaoCategoriaContainingIgnoreCase(PegaDescricao);
		
	if(ObjetoProduto.isEmpty())
	{
		return ResponseEntity.status(204).build();
	}else 
	{
		return ResponseEntity.status(200).body(ObjetoProduto);
	}
	}
	
	@PutMapping("/Atualiza/Categoria/{AtualizaCat}")
	public ResponseEntity<@Valid Categoria> AtualizarCategoria (@Valid @RequestBody Categoria BodyCategoria, @PathVariable(value = "AtualizaCat")Long AtualizaCat)
	{
		if(Repositorio.existsById(AtualizaCat)!=false && AtualizaCat==BodyCategoria.getID())
		{
			return ResponseEntity.status(201).body(Repositorio.save(BodyCategoria));
		}else
		{
			return ResponseEntity.status(203).build();
		} 
	}
	
	@DeleteMapping("/Delete/{DeletarViaID}")
	@ResponseStatus(value = HttpStatus.OK)
	public void DeletarCategoria(@PathVariable(value = "DeletarViaID")Long DeletCategoria)
	{
		Repositorio.deleteById(DeletCategoria);
	}
}
