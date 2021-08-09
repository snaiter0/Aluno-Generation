package Herança;

public class Preguiça extends Animal {
	
	private String especie;
	private boolean sobe;
	private double peso;
	
	public Preguiça (String nome, int idade,boolean som,
			String especie, boolean sobe, double d)
	{
		super(nome, idade,som);
		setEspecie(especie);
		setSobe(sobe);
		setPeso(d);
	}
	
	public void imprimir ()
	{
		System.out.println(
				"\nNome: " + getNome()
				+ "\nIdade: " + getIdade()
				+ "\nEmite Som? " + isSom()
				+ "\nEspecie: " + getEspecie()
				+ "\nSobe em arvore?" + isSobe()
				+ "\nQuanto pesa?" + getPeso()
				
				);

	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isSobe() {
		return sobe;
	}

	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}