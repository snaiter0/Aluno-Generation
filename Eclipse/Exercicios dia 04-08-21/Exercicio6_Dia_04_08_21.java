package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio6_Dia_04_08_21 
{

	public static void main(String[] args) 
	{
		int Numero,soma=0,Conta=0, ContaNumeros=0;
		float MediaP3;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira o valor 0 para finalizar o programa.");
	do
	{
		
		
		System.out.println("\nInsira um numero qualquer: ");
		Numero=leia.nextInt();
		
		if(Numero%3==0&&Numero!=0)
		{
			soma+=Numero;
			Conta++;
		}
			
		ContaNumeros++;
		
	}
	while(Numero!=0);
	
	if(ContaNumeros>1) 
	{
	MediaP3 = soma/(Conta);
	
	System.out.println("\n A quantidade de numeros inseridos foi: "+ ContaNumeros);
	System.out.println("\n A quantidade de numeros multiplos de 3 foi: "+ Conta);
	System.out.printf("\n A média de números multiplos de 3 é igual a: %.1f", MediaP3);
	}
	else
	{
		System.out.println("O programa foi finalizado.");
	}
	}
}
