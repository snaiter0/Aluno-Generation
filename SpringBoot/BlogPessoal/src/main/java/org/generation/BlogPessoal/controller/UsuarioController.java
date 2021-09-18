package org.generation.BlogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.BlogPessoal.Model.UserLogin;
import org.generation.BlogPessoal.Model.Usuario;
import org.generation.BlogPessoal.Repository.UsuarioRepository;
import org.generation.BlogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins="*", allowedHeaders="*")
public class UsuarioController
{
	@Autowired
	private UsuarioService usuarioService;
	private UsuarioRepository repositorio;
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication (@Valid @RequestBody Optional<UserLogin> user)
	{
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(203).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@Valid @RequestBody Usuario usuario)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuarioService.CadastrarUsuario(usuario));
	}
	
	@GetMapping("/Listar/Todos")
	public ResponseEntity<List<Usuario>> pegarTodos()
	{
		return ResponseEntity.status(200).body(repositorio.findAll());
	}
	
}
