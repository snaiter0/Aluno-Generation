package org.generation.BlogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.generation.BlogPessoal.Model.Usuario;
import org.generation.BlogPessoal.Repository.UsuarioRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest 
{
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		Usuario usuario = new Usuario(0L, "joao", "joao@email.com", "190899");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		 usuario = new Usuario(0L, "Joaquina", "Joaquina@email.com", "535423");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		 usuario = new Usuario(0L, "Fernanda", "Fernanda@email.com", "135642");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0L, "Darling", "Darling@email.com", "255452");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
	}

		@SuppressWarnings("unlikely-arg-type")
		@Test
		@DisplayName("💿 Retorna nome")
		public void findByRetornaNome()
		{
			Optional<Usuario> usuario = usuarioRepository.findByUsuario("joao");
			assertTrue(usuario.get().equals("joao"));
		}
		
		@Test
		@DisplayName("💿 Retorna 4 usuários")
		void findAllByNomeContainingIgnoreCaseReturnaQuatroUsuários()
		{
			List<Usuario> ListaDeUsuarios = usuarioRepository.findAllByusuarioContainingIgnoreCase("a");
			assertEquals(4, ListaDeUsuarios.size());
		}
	
		@AfterAll
		void end() {
			System.out.println("Teste Finalizado!");
		}
}
