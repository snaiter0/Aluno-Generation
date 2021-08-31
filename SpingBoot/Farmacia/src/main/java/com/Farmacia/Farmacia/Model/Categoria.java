package com.Farmacia.Farmacia.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Categoria 
{
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long ID;
	private @NotBlank String nomeCategoria;
	private @NotBlank String descricaoCategoria;
	
	@OneToMany(mappedBy = "categoriasRelacionadas", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"produtoRelacionado"})
	
	private List<Produto> produtoRelacionado;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
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
	public List<Produto> getProdutoRelacionado() {
		return produtoRelacionado;
	}
	public void setProdutoRelacionado(List<Produto> produtoRelacionado) {
		this.produtoRelacionado = produtoRelacionado;
	}
	
	
}
