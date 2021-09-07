package org.generation.BlogPessoal.Repository;

import java.util.Optional;

import org.generation.BlogPessoal.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


	@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario, Long>
	{
		public Optional<Usuario> findByusuario (String usuario);
}


