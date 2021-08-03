package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio3_Dia_03_08_21 
{
	public static void main(String[] args) 
	{
		int idade, categoria=0;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n Insira sua idade: ");
		idade=leia.nextInt();
		
		if(idade>=10 && idade<=14) 
		{
		categoria = 1;
		
		}
		
		if(idade>=15 && idade<=17) 
		{
		categoria = 2;
		
		}
		
		if(idade>=18 && idade<=25) 
		{
		categoria = 3;
		}
		
		
		switch(categoria) {
		
		case 1:
			System.out.println("Sua categoria é Infantil.");
			break;
			
		case 2:
			System.out.println("Sua categoria é Juvenil.");
			break;
			
		case 3:
			System.out.println("Sua categoria é Adulto.");
			break;
			
			default:
				System.out.println("Idade fora dos parametros.");
	}
	}
}
