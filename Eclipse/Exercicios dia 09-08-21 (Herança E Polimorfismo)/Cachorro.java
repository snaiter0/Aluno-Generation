package Herança;

public class Cachorro extends Animal {

	private String raça;
	private String porte;
	private String cor;
	private boolean competição;
	private boolean corrida;
	
	
	public Cachorro (String nome, int idade,boolean som, String raça, 
			String porte, String cor, boolean competição, boolean corrida)
	{
		super(nome, idade,som);
		setRaça(raça);
		setPorte(porte);
		setCompetição(competição);
		setCorrida(corrida);
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
	
}