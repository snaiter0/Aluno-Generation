package POO;

import java.util.Scanner;

public class Eletrônico 
{
	
	private String nome; 
	private String TensaoIn;
	private String TensaoOut;
	private String CorrenteOut;
	private String Potencia;
	Scanner Leia = new Scanner(System.in);
	
	
	public Eletrônico(String N,String Tin,String Tout,String IO,String P)
	{
		
		
		System.out.println("Nome do eletrônico: ");
		this.setNome(Leia.nextLine());
		System.out.println("Tensão de entrada do eletrônico: ");
		this.setTensaoIn(Leia.nextLine());
		System.out.println("Tensão de saída do eletrônico: ");
		this.setTensaoOut(Leia.nextLine());
		System.out.println("Corrente de saída do eletrônico: ");
		this.setCorrenteOut(Leia.nextLine());
		System.out.println("A potencia do eletrônico: ");
		this.setPotencia(Leia.nextLine());
		
		
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTensaoIn() {
		return TensaoIn;
	}
	public void setTensaoIn(String tensaoIn) {
		TensaoIn = tensaoIn;
	}
	public String getTensaoOut() {
		return TensaoOut;
	}
	public void setTensaoOut(String tensaoOut) {
		TensaoOut = tensaoOut;
	}
	public String getCorrenteOut() {
		return CorrenteOut;
	}
	public void setCorrenteOut(String correnteOut) {
		CorrenteOut = correnteOut;
	}
	public String getPotencia() {
		return Potencia;
	}
	public void setPotencia(String potencia) {
		Potencia = potencia;
	}
	
	
	public void ImprimirInformações()
	{
		System.out.println("\t\t"+nome+"\nA Tensão de entrada é de: "+TensaoIn+".\nA de saíde da fonte é: "+TensaoOut+".\nA corrente de saída é de: "+CorrenteOut+".\nA potencia do eletrônico é de: "+Potencia+".");
	}
}
