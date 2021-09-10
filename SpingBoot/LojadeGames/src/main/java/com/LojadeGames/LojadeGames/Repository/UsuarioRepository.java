package com.LojadeGames.LojadeGames.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojadeGames.LojadeGames.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
	Optional<Usuario> findByEmailIgnoreCase(String email);
}
	
