package com.Farmacia.Farmacia.Model;

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
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long IDProduto;
	private @NotBlank String nome;
	private @NonNull Float preco;
	private @NotBlank String descricaoProduto;
	
	@ManyToOne
	@JsonIgnoreProperties({"categoriasRelacionadas"})
	@JoinColumn(name = "Categoria_ID")
	private Categoria categoriasRelacionadas;
	
	public Long getIDProduto() {
		return IDProduto;
	}
	public void setIDProduto(Long iDProduto) {
		IDProduto = iDProduto;
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
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public Categoria getCategoriasRelacionadas() {
		return categoriasRelacionadas;
	}
	public void setCategoriasRelacionadas(Categoria categoriasRelacionadas) {
		this.categoriasRelacionadas = categoriasRelacionadas;
	}
	
	
}
