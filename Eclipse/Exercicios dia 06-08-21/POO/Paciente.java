package POO;

public class Paciente 
{

	private String Nome;
	private int Idade;
	private int Pressão;
	private String Data;
	
public Paciente(String N,int I,int P,String D)

{
	this.setNome(N);
	this.setIdade(I);
	this.setPressão(P);
	this.setData(D);
	
}


public String getNome() {
	return Nome;
}


public void setNome(String nome) {
	Nome = nome;
}


public int getIdade() {
	return Idade;
}


public void setIdade(int I) {
	Idade = I;
}


public int getPressão() {
	return Pressão;
}


public void setPressão(int P) {
	Pressão = P;
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
	System.out.println("Idade: "+Idade);
	System.out.println("Pressão: "+Pressão+"/8");
	System.out.println("Data: "+Data);
	
	
}

}
