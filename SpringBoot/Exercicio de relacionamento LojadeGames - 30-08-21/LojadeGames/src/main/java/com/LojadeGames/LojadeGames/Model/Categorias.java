package com.LojadeGames.LojadeGames.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name =  "Categoria")
public class Categorias 
{
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	private @NotBlank String nomeCategoria;
	private @NotBlank String descricaoCategoria;
	
	 

	@OneToMany(mappedBy = "categoriasrelacionadas")
	@JsonIgnoreProperties({"produtorelacionado"})
	private List<Produto> produtorelacionado;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nomeCategoria;
	}
	public void setNome(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public String getDescricao() {
		return descricaoCategoria;
	}
	public void setDescricao(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	public List<Produto> getProdutorelacionado() {
		return produtorelacionado;
	}
	public void setProdutorelacionado(List<Produto> produtorelacionado) {
		this.produtorelacionado = produtorelacionado;
	}
	

}
