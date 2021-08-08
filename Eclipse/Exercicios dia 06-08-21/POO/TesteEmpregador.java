package POO;

public class TesteEmpregador 
{

	public static void main(String[] args)
	{
		
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Diego Silva",10000);
		lista[1] = new Empregado("Juliana",9000);
		lista[2] = new Empregado("Mayara Luzia",20000);
		
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
	System.out.println("***************************");
	
	for(Empregado roda:lista)
	{
		roda.aumentarSalario(10);
		roda.imprimir();
	}
	
	}
	
}
