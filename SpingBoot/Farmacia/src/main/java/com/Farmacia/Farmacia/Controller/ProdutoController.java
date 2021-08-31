package com.Farmacia.Farmacia.Controller;

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

import com.Farmacia.Farmacia.Model.Produto;
import com.Farmacia.Farmacia.Repository.ProdutoRepository;

@RestController
@RequestMapping("/Produtos")
@CrossOrigin("*")
public class ProdutoController 
{
	
	@Autowired ProdutoRepository Repositorio;

	 
	@GetMapping("/Pesquisa/Nome/{PegaNome}")
	public ResponseEntity<List<Produto>> GetNome_Produto (@PathVariable(value = "PegaNome") String PegaNome)
	{
		return ResponseEntity.status(201).body(Repositorio.findAllByNomeContainingIgnoreCase(PegaNome));
	}
	
	@GetMapping("/Pesquisa/Descricao/{Peganome}")
	public ResponseEntity<List<Produto>> Getnome_Produto (@PathVariable(value = "Peganome") String Peganome)
	{	
		List<Produto> ObjetoProduto = Repositorio.findAllByNomeContainingIgnoreCase(Peganome);
		
	if(ObjetoProduto.isEmpty())
	{
		return ResponseEntity.status(204).build();
	}else 
	{
		return ResponseEntity.status(200).body(ObjetoProduto);
	}
	}
	@GetMapping("/Pesquisa/PegaTodos")
	public ResponseEntity<List<Produto>> GetTodos_Produto ()
	{
		return ResponseEntity.status(201).body(Repositorio.findAll());
	}
	
	@GetMapping("/Pesquisa/ID/{PegaId}")
	public ResponseEntity<Optional<Produto>> ProcurarPorID_Produto (@PathVariable(value = "PegaId") Long PegaId)
	{
		return ResponseEntity.status(201).body(Repositorio.findById(PegaId));
	}

	@PostMapping("/Salvar")
	public ResponseEntity<Produto> Salvar_Produto(@Valid @RequestBody Produto NovaCategoria)
	{
		return ResponseEntity.status(201).body(Repositorio.save(NovaCategoria));
	}
	
	@PutMapping("/Atualizar/{IDSolicitado}")
	public ResponseEntity<Produto> Atualiza_Produto(@Valid @RequestBody Produto AtualizaCategoria,@PathVariable(value = "IDSolicitado") Long IDSolicitado)
	{	
		if(Repositorio.existsById(IDSolicitado)!=false && AtualizaCategoria.getIDProduto()==IDSolicitado)
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
	

