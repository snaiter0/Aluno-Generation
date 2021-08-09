package POO;

import java.text.NumberFormat;
import java.util.Scanner;

public class Funcionario 
{

	private String Nome_Funcionario;
	private String CPF;
	private String Tipo_Contrato;
	private Double Salario;
	private Double Pag_Hora_extra;
	
	public Funcionario(String N,String C,String T,Double S,Double P)
	
	{
		
		@SuppressWarnings("resource")
		Scanner Leia = new Scanner(System.in);
		
		
		System.out.println("Insira o nome do funcionario: ");
		this.setNome_Funcionario(Leia.nextLine());
		System.out.println("Insira o CPF do funcionario: ");
		this.setCPF(Leia.nextLine());
		System.out.println("Insira o tipo de contrato do funcionario: ");
		this.setTipo_Contrato(Leia.nextLine());
		System.out.println("Insira o salario do funcionario: ");
		this.setSalario(Leia.nextDouble());
		System.out.println("Insira o pagamento adicional do funcionario: ");
		this.setPag_Hora_extra(Leia.nextDouble());
		
		
		
	}

	

	public String getNome_Funcionario() {
		return Nome_Funcionario;
	}

	public void setNome_Funcionario(String nome_Funcionario) {
		Nome_Funcionario = nome_Funcionario;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTipo_Contrato() {
		return Tipo_Contrato;
	}

	public void setTipo_Contrato(String tipo_Contrato) {
		Tipo_Contrato = tipo_Contrato;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double string) {
		Salario = string;
	}

	public Double getPag_Hora_extra() {
		return Pag_Hora_extra;
	}

	public void setPag_Hora_extra(Double pag_Hora_extra) {
		Pag_Hora_extra = pag_Hora_extra;
	}
	
	public String FormatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String formatoMoeda = nf.format(Salario);
		return formatoMoeda;
	}
	
	public String FormatarMoeda1()
	{
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		String formatoMoeda = nf1.format(Pag_Hora_extra);
		return formatoMoeda;
	}
	
	public void ImprirmirInfo()
	{
		System.out.println("Funcionario: "+Nome_Funcionario);
		System.out.println("Portador do CPF: "+CPF);
		System.out.println("Tipo de contrato: "+Tipo_Contrato);
		
		
		System.out.println("Salario: "+this.FormatarMoeda());
		System.out.println("Pagamento adicional: "+this.FormatarMoeda1());
		
	}
	
}
