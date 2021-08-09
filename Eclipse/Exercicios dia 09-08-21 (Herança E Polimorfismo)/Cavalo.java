package Herança;

public class Cavalo extends Animal {
	
	private String raça;
	private String porte;
	private String cor;
	private boolean competição;
	private boolean corrida;
	private String pais;
	
	public Cavalo (String nome, int idade,boolean som, String raça, 
			String porte, String cor, boolean competição, boolean corrida, String pais)
	{
		super(nome, idade,som);
		setRaça(raça);
		setPorte(porte);
		setCompetição(competição);
		setCorrida(corrida);
		setPais (pais);
	}
	
	public void imprimir ()
	{
		System.out.println(
				"\nNome: " + getNome()
				+ "\nIdade: " + getIdade()
				+ "\nEmite Som? " + isSom()
				+ "\nRaça: " + getRaça()
				+ "\nPorte:" + getPorte()
				+ "\nCompete?" + isCompetição()
				+ "\nCorre?" + isCorrida()
				+ "\nPais de Origem" + getPais()
				
				);

	}
	
	public boolean isCorrida() {
		return corrida;
	}

	public void setCorrida(boolean corrida) {
		this.corrida = corrida;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isCompetição() {
		return competição;
	}

	public void setCompetição(boolean competição) {
		this.competição = competição;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}