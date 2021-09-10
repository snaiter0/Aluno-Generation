package com.LojadeGames.LojadeGames.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Produtos")
public class Produto 
{
	private @GeneratedValue(strategy = GenerationType.IDENTITY) @Id Long ID;
	private @NotBlank String nome;
	private @NonNull Float preco;
	private @NotBlank String descricao;

	@ManyToOne
	@JsonIgnoreProperties({"categoriasrelacionadas"})
	@JoinColumn(name = "Classe_ID")
	public Categorias categoriasrelacionadas;
	
	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getPreco() {
		return preco;
	} 
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categorias getCategoriasrelacionadas() {
		return categoriasrelacionadas;
	}
	public void setCategoriasrelacionadas(Categorias categoriasrelacionadas) {
		this.categoriasrelacionadas = categoriasrelacionadas;
	}
	

	
}
