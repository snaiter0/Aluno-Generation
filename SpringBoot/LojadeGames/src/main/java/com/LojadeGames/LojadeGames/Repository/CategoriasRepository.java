package com.LojadeGames.LojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojadeGames.LojadeGames.Model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>
{
	public List<Categorias>findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);
}
