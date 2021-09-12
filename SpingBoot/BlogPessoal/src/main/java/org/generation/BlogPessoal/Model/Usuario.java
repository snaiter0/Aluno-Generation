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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	@NotBlank
	private String usuario;
	@NotBlank
	private String email;
	private String senha;
	
	@OneToMany(mappedBy = "criador", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"criador"})
	private List<Postagem> minhasPostagens = new ArrayList<>();

	public Usuario(Long idUsuario,String usuario, String email,
			String senha) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario() {
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Postagem> getMinhasPostagens() {
		return minhasPostagens;
	}

	public void setMinhasPostagens(List<Postagem> minhasPostagens) {
		this.minhasPostagens = minhasPostagens;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
