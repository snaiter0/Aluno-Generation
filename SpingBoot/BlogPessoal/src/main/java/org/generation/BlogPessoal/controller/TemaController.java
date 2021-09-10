package org.generation.BlogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.BlogPessoal.Model.Tema;
import org.generation.BlogPessoal.Repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Temas")
@CrossOrigin("*")
public class TemaController 
{

	@Autowired
	private TemaRepository Repositorio;
	
	@GetMapping("/Todes")
	public ResponseEntity<List<Tema>> PegarTodos()
	{
		return ResponseEntity.ok(Repositorio.findAll());
	}
	
	@GetMapping("/TemaID/{TemaId}")
	public ResponseEntity<Tema> PegarTemaPorId(@PathVariable(value = "TemaId")Long idTema)
	{
		Optional<Tema> ObjectTema =Repositorio.findById(idTema);
		
		if(ObjectTema.isEmpty())
		{
			return ResponseEntity.status(200).body(ObjectTema.get());
		}else {
			return ResponseEntity.status(204).build();
		}
	}
	
	@PostMapping ("/Salvar")
	public ResponseEntity<Tema> SalvarTema(@Valid @RequestBody Tema NovoTema)
	{
		return ResponseEntity.status(201).body(Repositorio.save(NovoTema));
	}
	
	@GetMapping("/BuscarPorTema/{TextTema}")
	public Object BuscarPorTema(@Valid @PathVariable(value = "TextTema") String TextoTema)
	{
		List<Tema> ObjeticTema = Repositorio.findAllByTemaContainingIgnoreCase(TextoTema);
			return ResponseEntity.status(201).body(ObjeticTema);	
	}
	
	@PutMapping("/AtualizarTema/{AtualizaTema}")
	public ResponseEntity<Tema> AtualizarDados(@Valid  @PathVariable(value = "AtualizaTema")  Long AtualizaTema,@RequestBody Tema Content)
	{
		boolean ObjectTema = Repositorio.existsById(AtualizaTema);
		if(ObjectTema == true)
		{
			Repositorio.deleteById(AtualizaTema);
			return ResponseEntity.status(201).body(Repositorio.save(Content));
		}else
		{
			return ResponseEntity.status(204).build();
		}
		
	}
		
	
	

}
