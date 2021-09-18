package org.generation.BlogPessoal.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Tema")
public class Tema 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTema;
	
	@NotBlank
	private String tema;
	
	@OneToMany(mappedBy = "temaRelacionado", cascade = CascadeType.REMOVE)
	private List<Postagem> postagens = new ArrayList<>();
	
	
	public Long getIdTema() {
		return idTema;
	}
	public void setIdTema(Long idTema) {
		this.idTema = idTema;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
