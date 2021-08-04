package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio1_Dia_04_08_21 {
	
	public static void main(String[] args) 
	{
		int numero = 0, resto,x=1000;
	
		for(x=1000;x<=1999;x++)
		{
			if(x%11==5)
			{
				numero = x;
				resto = numero;
				System.out.println("\nO resto de: "+numero+" dividido por 11 é igual a 5.");
				
			}
		}
		
		
		
	}

}
