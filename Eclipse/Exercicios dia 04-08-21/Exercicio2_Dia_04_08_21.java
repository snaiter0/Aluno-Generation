package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio2_Dia_04_08_21 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int par=0,impar=0,numero,x;
		

		for(x=0;x<10;x++)
		{
			System.out.println("\nInsira um numero qualquer: ");
			numero=leia.nextInt();
			if(numero%2==0)
				
			{
			System.out.println("O numero: "+numero+" é par.");
			par++;
			}
			
			
			else 
			{
				System.out.println("O numero: "+numero+" é impar.");
				impar++;
			}
			
			
			
			
		}
		
		System.out.println("Quantidade de numeros pares: "+par);
		System.out.println("Quantidade de numeros ímpares: "+impar);
	}
	
	
	
}
