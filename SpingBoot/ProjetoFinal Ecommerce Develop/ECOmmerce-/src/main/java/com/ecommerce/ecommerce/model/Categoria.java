package com.ecommerce.ecommerce.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;


@Entity
@Table(name = "Categoria")
public class Categoria {
	
	private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long idCategoria;
	private @NonNull Boolean casaEConstrucao;
	private @NonNull Boolean paraLevar;
	private @NonNull Boolean Jardinagem;
	private @NonNull Boolean higieneECosmeticos;
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public Boolean getCasaEConstrucao() {
		return casaEConstrucao;
	}
	public Boolean getParaLevar() {
		return paraLevar;
	}
	public Boolean getJardinagem() {
		return Jardinagem;
	}
	public Boolean getHigieneECosmeticos() {
		return higieneECosmeticos;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public void setCasaEConstrucao(Boolean casaEConstrucao) {
		this.casaEConstrucao = casaEConstrucao;
	}
	public void setParaLevar(Boolean paraLevar) {
		this.paraLevar = paraLevar;
	}
	public void setJardinagem(Boolean jardinagem) {
		this.Jardinagem = jardinagem;
	}
	public void setHigieneECosmeticos(Boolean higieneECosmeticos) {
		this.higieneECosmeticos = higieneECosmeticos;
	} 
	
	 
}
