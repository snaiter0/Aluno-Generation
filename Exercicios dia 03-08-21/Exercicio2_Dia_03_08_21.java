package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio2_Dia_03_08_21 {

	public static void main(String[] args) 
	{
		int ordem,Pag1,Pag2,Pag3,x,MaiorPag = 0,MenorPag = 0,MedioPag = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o valor do primeiro pagamento: ");
		Pag1=leia.nextInt();
		System.out.println("\nInsira o valor do segundo pagamento: ");
		Pag2=leia.nextInt();
		System.out.println("\nInsira o valor do terceiro pagamento: ");
		Pag3=leia.nextInt();
		
		
		
		
			if(Pag1>Pag2 && Pag1>Pag3) 
			{
				MaiorPag=Pag1;
			}
		
			if(Pag2>Pag1 && Pag2>Pag3) 
			{
				MaiorPag=Pag2;
			}
	
			if(Pag3>Pag1 && Pag2<Pag3) 
			{
				MaiorPag=Pag3;
			}
	
			//menor pagamento
			
			if(Pag1<Pag2 && Pag1<Pag3) 
			{
				MenorPag=Pag1;
			}
		
			if(Pag2<Pag1 && Pag2<Pag3) 
			{
				MenorPag=Pag2;
			}
	
			if(Pag3<Pag1 && Pag3<Pag2) 
			{
				MenorPag=Pag3;
			}
			
			//pagamento medio
			
			if(Pag1>Pag2 && Pag1<Pag3) 
			{
				MedioPag=Pag1;
			}
		
			if(Pag1<Pag2 && Pag1>Pag3) 
			{
				MedioPag=Pag1;
			}
			
			if(Pag2>Pag1 && Pag2<Pag3) 
			{
				MedioPag=Pag2;
			}
	
			if(Pag2<Pag1 && Pag2>Pag3) 
			{
				MedioPag=Pag2;
			}
			
			if(Pag3>Pag1 && Pag3<Pag2) 
			{
				MedioPag=Pag3;
			}
			
			if(Pag3<Pag1 && Pag3>Pag2) 
			{
				MedioPag=Pag3;
			}
			
			
			
			System.out.println("\n O maior pagamento foi de: R$"+MaiorPag);
			
			System.out.println("\n O segundo pagamento foi de: R$"+MedioPag);
			
			System.out.println("\n O menor pagamento foi de: R$"+MenorPag);
			
			
		}

}
