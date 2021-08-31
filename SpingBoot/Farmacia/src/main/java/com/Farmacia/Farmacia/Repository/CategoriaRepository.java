package com.Farmacia.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmacia.Farmacia.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria ,Long>
{
	 public List<Categoria> findAllBydescricaoCategoriaContainingIgnoreCase(String descricaoCategoria);
}
