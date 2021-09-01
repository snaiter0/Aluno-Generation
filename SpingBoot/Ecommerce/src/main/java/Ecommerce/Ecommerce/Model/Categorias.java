package Ecommerce.Ecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Categorias")
public class Categorias  
{
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idCategoria;
	private @Valid @NotNull Boolean casaeConstrucao;
	private @Valid @NotNull Boolean paraLevar;
	private @Valid @NotNull Boolean jardinagem;
	private @Valid @NotNull Boolean culinaria;
	private @Valid @NotNull Boolean higieneeCostimeticos;
	
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public Boolean getcasa_e_Construcao() {
		return casaeConstrucao;
	}
	public void setcasa_e_Construcao(Boolean casaeConstrucao) {
		this.casaeConstrucao = casaeConstrucao;
	}
	public Boolean getpara_Levar() {
		return paraLevar;
	}
	public void setpara_Levar(Boolean paraLevar) {
		this.paraLevar = paraLevar;
	}
	public Boolean getjardinagem() {
		return jardinagem;
	}
	public void setjardinagem(Boolean jardinagem) {
		this.jardinagem = jardinagem;
	}
	public Boolean getculinaria() {
		return culinaria;
	}
	public void setculinaria(Boolean culinaria) {
		this.culinaria = culinaria;
	}
	public Boolean gethigiene_e_Costimeticos() {
		return higieneeCostimeticos;
	}
	public void sethigiene_e_Costimeticos(Boolean higieneeCostimeticos) {
		this.higieneeCostimeticos = higieneeCostimeticos;
	}
	
	
}
