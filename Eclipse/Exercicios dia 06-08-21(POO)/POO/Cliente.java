package POO;

import java.text.NumberFormat;

public class Cliente 
{

	private String 	nome;
	private String 	perfil;
	private double	saldo;
	
	public Cliente(String j, String e, double s)
	{
		this.setNome(j);
		this.setPerfil(e);
		this.setSaldo(s);
		
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a moeda padrão do país
		nf.setMinimumFractionDigits(2); // Define a quantidade de casas depois da vírgula 
		String formatoMoeda = nf.format(saldo); //Formata a saída do salário
		return formatoMoeda;
	}
	public void imprimirInfo()
	
	{
		System.out.println("\t\tInformações do cliente: "+nome+"\n");
		System.out.println("Perfil do cliente: "+perfil);
		System.out.println("Saldo do cliente é equivalente a: "+this.formatarMoeda());
		
		
	}
	
	
	
	
	
}
