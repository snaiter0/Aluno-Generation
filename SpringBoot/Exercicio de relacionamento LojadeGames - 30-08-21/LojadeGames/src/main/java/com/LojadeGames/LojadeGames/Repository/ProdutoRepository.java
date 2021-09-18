package com.LojadeGames.LojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.LojadeGames.LojadeGames.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
	
	public List<Produto> findAllByDescricaoIgnoreCaseContaining(String descricao);
	
}
