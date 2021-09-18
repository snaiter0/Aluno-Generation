package com.LojadeGames.LojadeGames.Model.util;


/**
 * Classe espelho de Model.Usuario, responsavel por validar acesso de usuario no sistema. É necessario que
 * seja passado pelo usuario o email e a senha para autenticação
 * 
 * @author Turma 29
 * @since 1.0
 *
 */
public class UsuarioDTO 
{
	
	private String email;
	private String senha;
	
	private Long id;
	private String nome;
	private String token;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	} 
	 
	
	
	
}
