package com.LojadeGames.LojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojadeGames.LojadeGames.Model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long>
{
	public List<Categorias>findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);

}
