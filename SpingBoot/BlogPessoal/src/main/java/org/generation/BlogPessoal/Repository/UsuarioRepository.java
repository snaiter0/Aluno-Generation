package org.generation.BlogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class UsuarioRepository {

	
	@Repository
	public interface usuario extends JpaRepository<usuario, Long>{
		public List<usuario> findAllByTituloContainingIgnoreCase (String Titulo);
}
}
