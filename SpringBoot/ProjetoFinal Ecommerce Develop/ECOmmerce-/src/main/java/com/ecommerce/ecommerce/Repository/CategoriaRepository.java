package com.ecommerce.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>
{
	
}