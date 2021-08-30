package Ecommerce.Ecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Categorias")
public class Categorias 
{
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idCategoria;
	private @NotBlank @Size(min=5 ,max=40) String Casa_e_Construcao;
	private @NotBlank @Size(min=5 ,max=40) String Para_Levar;
	private @NotBlank @Size(min=5 ,max=40) String Jardinagem;
	private @NotBlank @Size(min=5 ,max=40) String Culinaria;
	private @NotBlank @Size(min=5 ,max=40) String Higiene_e_Costimeticos;
	
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCasa_e_Construcao() {
		return Casa_e_Construcao;
	}
	public void setCasa_e_Construcao(String casa_e_Construcao) {
		Casa_e_Construcao = casa_e_Construcao;
	}
	public String getPara_Levar() {
		return Para_Levar;
	}
	public void setPara_Levar(String para_Levar) {
		Para_Levar = para_Levar;
	}
	public String getJardinagem() {
		return Jardinagem;
	}
	public void setJardinagem(String jardinagem) {
		Jardinagem = jardinagem;
	}
	public String getCulinaria() {
		return Culinaria;
	}
	public void setCulinaria(String culinaria) {
		Culinaria = culinaria;
	}
	public String getHigiene_e_Costimeticos() {
		return Higiene_e_Costimeticos;
	}
	public void setHigiene_e_Costimeticos(String higiene_e_Costimeticos) {
		Higiene_e_Costimeticos = higiene_e_Costimeticos;
	}
	
	
}
