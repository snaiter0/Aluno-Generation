package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio5_Dia_04_08_21 
{
	public static void main(String[] args) 
	{
		
		int numero,soma=0,QuantNumeros=0;
		Scanner leia = new Scanner(System.in);
		
		
		do
		{
			System.out.println("Insira um numero: ");
			numero=leia.nextInt();
			soma+=numero;
			QuantNumeros++;
			
		}
		while(numero!=0);
		
		System.out.println("Soma total dos numeros inseridos: "+soma);
		System.out.println("Quantidade de numeros inseridos: "+QuantNumeros);
		
		
		
		
	}

}
