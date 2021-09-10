package com.LojadeGames.LojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojadeGames.LojadeGames.Model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
	
	public List<Produto> findAllByDescricaoIgnoreCaseContaining(String descricao);
	
}
