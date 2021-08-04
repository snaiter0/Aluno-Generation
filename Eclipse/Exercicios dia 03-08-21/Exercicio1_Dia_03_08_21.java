package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio1_Dia_03_08_21 {

	public static void main(String[] args) 
	{
		int Pag1, Pag2, Pag3, x;
		Scanner leia = new Scanner(System.in);

	
		for(x=0;x<3;x++) 
		{
			System.out.println("\nInsira o valor do pagamento 1: ");
			Pag1=leia.nextInt();
			System.out.println("\nInsira o valor do pagamento 2: ");
			Pag2=leia.nextInt();
			System.out.println("\nInsira o valor do pagamento 3: ");
			Pag3=leia.nextInt();
			
			if(Pag1>Pag2 && Pag1>Pag3) 
			
			{
				System.out.println("O maior pagamento foi o pagamento 1, com: R$"+Pag1+" reais");
			}
	
			else if(Pag2>Pag1 && Pag2>Pag3) 
				
			{
				System.out.println("O maior pagamento foi o pagamento 2, com: R$"+Pag2+" reais");
			}
			
			else
				
			{
				System.out.println("O maior pagamento foi o pagamento 3, com: R$"+Pag3+" reais");
			}
			
		}
	}

}
