package Ecommerce.Ecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Produtos")
public class Produtos 
{
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long idProduto;
	private @NotNull @Size (min=3,max=8) String Nome;
	private @NotNull @Size(min=3,max=8) String Marca;
	private @NotNull @Size (min=3,max=8)float preco;
	private @NotNull @Size(min=5,max=500) String Descricao;
	private @NotNull @Size(min=2,max=6) float Tamanho;
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public float getTamanho() {
		return Tamanho;
	}
	public void setTamanho(float tamanho) {
		Tamanho = tamanho;
	}
	
	
	
}
