package com.blogpessoal.Turma29.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.Turma29.modelos.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

	/**
	 * Metódo para procurar o nome de usuario.
	 * @param Turma29
	 * @return
	 */
		List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
}
