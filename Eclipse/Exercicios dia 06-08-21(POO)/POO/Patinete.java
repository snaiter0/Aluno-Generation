package POO;

import java.util.Scanner;

public class Patinete 
{

	private String marca;
	private String cor;
	private String mecanico;
	private int datacompra;
	
	Scanner leia = new Scanner(System.in);
	
	public Patinete(String marca,String cor,String mecanico,int datacompra)
	
	{
		System.out.println("Insira a marca do patinete: ");
		this.setMarca(leia.nextLine());
		System.out.println("Insira a cor do patinete:");
		this.setCor(leia.nextLine());
		System.out.println("Informe se é mecanico ou eletrico:");
		this.setMecanico(leia.nextLine());
		System.out.println("Informe a data da compra");
		this.setDatacompra(leia.nextInt());
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMecanico() {
		return mecanico;
	}

	public void setMecanico(String mecanico) {
		this.mecanico = mecanico;
	}

	public int getDatacompra() {
		return datacompra;
	}

	public void setDatacompra(int datacompra) {
		this.datacompra = datacompra;
	}
	
	public void ImprimirInfos()
	{
		System.out.println("Marca: "+marca+"\nCor: "+cor+"\nMecanico: "+mecanico+"\nData da compra: "+datacompra);
	}
	
	
}
