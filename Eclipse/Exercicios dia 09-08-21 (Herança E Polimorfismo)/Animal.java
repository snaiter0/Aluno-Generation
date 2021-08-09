package Herança;

public class Animal {

	private String nome;
	private int idade;
	private boolean som;
	
	
	public Animal (String nome, int idade,boolean som)
	{
		super();
		setNome(nome);
		setIdade(idade);
		setSom(som);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}
	
	
}