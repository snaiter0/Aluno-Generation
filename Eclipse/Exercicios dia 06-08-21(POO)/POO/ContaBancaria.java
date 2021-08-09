package POO;

public class ContaBancaria 
{

	private String Nome;
	private String Tipo_Conta;
	private Double Saldo;
	private String Data;
	
public ContaBancaria(String N,String T,Double S,String D)

{
	this.setNome(N);
	this.setTipo_Conta(T);
	this.setSaldo(S);
	this.setData(D);
	
}

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public String getTipo_Conta() {
	return Tipo_Conta;
}

public void setTipo_Conta(String tipo_Conta) {
	Tipo_Conta = tipo_Conta;
}

public Double getSaldo() {
	return Saldo;
}

public void setSaldo(Double saldo) {
	Saldo = saldo;
}

public String getData() {
	return Data;
}

public void setData(String data) {
	Data = data;
}

public void ImprimirInfo()
{
	
	
	System.out.println("Nome: "+Nome);
	System.out.println("Tipo de conta: "+Tipo_Conta);
	System.out.println("Saldo bancario: R$"+Saldo+",00");
	System.out.println("Data: "+Data);
	
	
}

}
