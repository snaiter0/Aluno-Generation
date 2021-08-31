package com.Farmacia.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmacia.Farmacia.Model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}