package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	//criação do método especial Construtor
	public Empregado(String n, double s)
	{
		
		this.setNome(n); // chama o método setNome para inserir o parametro do atributo
		this.setSalario(s);
		
		
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
		public void aumentarSalario(double percentual)
		{
			salario *=1 +percentual/100;
		}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a moeda padrão do país
		nf.setMinimumFractionDigits(2); // Define a quantidade de casas depois da vírgula 
		String formatoMoeda = nf.format(salario); //Formata a saída do salário
		return formatoMoeda;
	}
		
	
	
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Salário: "+this.formatarMoeda());
	}
}
