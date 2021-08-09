package POO;

public class Automovel 
{
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// criação do método construtor
	
	public Automovel(String nomeProprietario,String modelo,String placa, int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo; // inicializa os atributos da classe automovel
		this.placa = placa;
		this.ano = ano;
		
	}
	
	
	public Automovel(String modelo)
	{
		this.modelo=modelo;
	}
	
	public void imprimirinfo()
	{
		System.out.println("\n"+nomeProprietario+
				" possui um(a): "+modelo+" com placa: "+placa+" e ano: "+ano);
	}
	
	
	
	
	
public String getNomeProprietario() {
		return nomeProprietario;
	}


	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


public static void main(String[] args) 
{
	
	
	
}
}