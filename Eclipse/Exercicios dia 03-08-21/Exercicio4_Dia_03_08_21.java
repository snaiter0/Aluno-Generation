package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio4_Dia_03_08_21 
{
	public static void main(String[] args) 


{
	float Valor;
	Scanner leia = new Scanner(System.in);
	System.out.println("\n Insira o valor: ");
	Valor=leia.nextInt();
	
	
	if(Valor%2==0) 
	{
		System.out.println("\n O valor de entrada é par: "+ Valor);
		System.out.println("\n A raiz quadrada do valor é de: " + Math.sqrt(Valor));
		
	}
	
	else
	{
		System.out.println("\n O valor de entrada é ímpar: "+ Valor);
		System.out.println("\n A elevação do valor ao quadrado é igual a: " + Math.pow(Valor,2));
	}
		
}
}
	

