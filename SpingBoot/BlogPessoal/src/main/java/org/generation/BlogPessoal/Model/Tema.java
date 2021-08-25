package org.generation.BlogPessoal.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	
}
