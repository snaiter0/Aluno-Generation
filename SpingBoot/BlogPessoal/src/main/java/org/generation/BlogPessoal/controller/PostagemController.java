package org.generation.BlogPessoal.controller;

import java.util.List;
import javax.validation.Valid;

import org.generation.BlogPessoal.Model.Postagem;
import org.generation.BlogPessoal.Repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Postagens")
@CrossOrigin("*")
public class PostagemController 
{
	@Autowired
	private PostagemRepository Repository;

	@GetMapping("/home")
	public String BoasVindes() 
	{
		return "Bem vindo ao meu blog!";
	}
	
	@GetMapping("/todes")
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(Repository.findAll());
		
	}
	@PostMapping("/salvar")
	public ResponseEntity<Postagem> salvar(@Valid @RequestBody Postagem NovaPostagem) {
		return ResponseEntity.status(201).body(Repository.save(NovaPostagem));
		
	}

	@GetMapping("/{id_usuario}")
	public ResponseEntity<Postagem> buscarPorId(@PathVariable(value="id_usuario") Long id_usuario){
		java.util.Optional<Postagem> objetoUsuario = Repository.findById(id_usuario);

		if (objetoUsuario.isPresent())
		{
			return ResponseEntity.status(200).body(objetoUsuario.get());
		}else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/Pesquisa/TITULO/{titulo}")
	public Object PesquisaPost(@Valid @PathVariable(value = "titulo")String titulo)
	{
		List<Postagem>TituloLista=Repository.findAllByTituloContainingIgnoreCase(titulo);
		
		if(TituloLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		}else {
		return ResponseEntity.status(200).body(TituloLista);
		}
	}
	
	@GetMapping("/Pesquisa/Titulo_Temas")

	@DeleteMapping("/DELETE/{idPostagem}")
	public void DeletarPostPorID (@PathVariable(value = "idPostagem")Long DeleteidPostagem)
	{
		Repository.deleteById(DeleteidPostagem);
	}
}
