package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio3_Dia_04_08_21 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int x,idade = 0,pessoas = 0,menorde21 = 0;
		
		
		
		while(idade!=-99)
		{
			System.out.println("\nInsira a idade: ");
			idade = leia.nextInt();
			
			if(idade<21&&idade>0)
			{
				menorde21++;
			}
			
			if(pessoas%5==0)
			{
				System.out.println("Para finalizar o programa entre com a idade -99");
			}
			pessoas++;
		}
		
		System.out.println("\n O total de pessoas entrevistadas foi de: "+pessoas);
		System.out.println("\n O total de menores de 21 anos foi de: "+menorde21);
	}
}
