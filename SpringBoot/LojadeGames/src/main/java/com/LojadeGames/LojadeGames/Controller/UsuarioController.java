package com.LojadeGames.LojadeGames.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojadeGames.LojadeGames.Model.Usuario;
import com.LojadeGames.LojadeGames.Model.util.UsuarioDTO;
import com.LojadeGames.LojadeGames.Repository.UsuarioRepository;
import com.LojadeGames.LojadeGames.Servicos.UsuarioServicos;

@RestController
@RequestMapping("/Usuarios")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired UsuarioRepository repository;
	@Autowired UsuarioServicos servicos;
	
	public ResponseEntity<List<Usuario>> PegarTodos(){
	return ResponseEntity.status(200).body(repository.findAll());
	}
	
	@PostMapping("/Salvar")
	public ResponseEntity<Object> salvar(@Valid @RequestBody Usuario novoUsuario) {
		Optional<Object> objetoOptional = servicos.cadastrarUsuario(novoUsuario);

		if (objetoOptional.isEmpty()) {
			return ResponseEntity.status(400).build();
		} else {
			return ResponseEntity.status(201).body(objetoOptional.get());
		}
	}
	
	@PutMapping("/Credenciais")
	public ResponseEntity<Object> credenciais(@Valid @RequestBody UsuarioDTO usuarioParaAutenticar) {
		Optional<?> objetoOptional = servicos.pegarCredenciais(usuarioParaAutenticar);

		if (objetoOptional.isEmpty()) {
			return ResponseEntity.status(400).build();
		} else {
			return ResponseEntity.status(201).body(objetoOptional.get());
		}
	}
	
	public ResponseEntity<Usuario> AtualizarUsuario(@RequestBody Usuario AtualizarUsuario){
		return ResponseEntity.status(200).body(repository.save(AtualizarUsuario));
	}

}
