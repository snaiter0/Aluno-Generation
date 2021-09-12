package org.generation.BlogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.generation.BlogPessoal.Model.Usuario;
import org.generation.BlogPessoal.Repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest 
{

	@Autowired
	private TestRestTemplate testRestTemplate;
	private UsuarioRepository usuarioRepository;
	
	private Usuario usuario;
	private Usuario usuarioUpdate;
	private Usuario usuarioAdmin;
	
	@BeforeAll
	public void start()
	{
		 usuarioAdmin = new Usuario(null, "joao", "joao@email.com", "190899");
		
		if(usuarioRepository.findByUsuarioContainingIgnoreCase(usuarioAdmin.getUsuario()).isEmpty()) {
			HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar",HttpMethod.POST, request,Usuario.class);
		}
	}
	
	@Test
	@DisplayName("Cadastrar Usuario")
	@Order(1)
	public void deveRealizarPostUsuario() {
		HttpEntity<Usuario> request= new HttpEntity<Usuario>(usuario);
		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar",HttpMethod.POST, request,Usuario.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	}
	
	@Test
	@DisplayName("Listar todos os Usuario")
	@Order(2)
	public void deveRealizarGetUsuario() {
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("joao@email.com","190899").exchange("/usuarios/Listar/Todos",HttpMethod.GET, null ,String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@DisplayName("Atualiza usuario")
	@Order(3)
	public void deveRealizarPutUsuario() {
		HttpEntity<Usuario> request= new HttpEntity<Usuario>(usuarioUpdate);
		ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("joao@email.com","190899").exchange("/usuarios/atualizar",HttpMethod.PUT, request ,Usuario.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	
	
	
}
