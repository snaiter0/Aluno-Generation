package org.generation.BlogPessoal.Repository;

import java.util.List;

import org.generation.BlogPessoal.Model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> 
{
	public List<Postagem> findAllByTextoContainingIgnoreCase(String texto);
	List<Postagem> findByTituloContainingIgnoreCase(String titulo);
}
