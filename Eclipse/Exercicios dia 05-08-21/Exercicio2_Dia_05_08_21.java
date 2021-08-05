package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio2_Dia_05_08_21 {

	public static void main(String[] args) 
	{
		int[] valores = new int[6];
		Scanner leia = new Scanner(System.in);
		int numero,SomaTotalPar = 0,SomaTotalImpar=0,ContPar = 0,ContImpar = 0;
		
		for(int x=0;x<6;x++)
		{
			System.out.println("\nInsira um valor: ");
			numero=leia.nextInt();
			
			if(numero%2==0)
			{
				SomaTotalPar+=numero;
				ContPar++;
			}
			
			else 
			{
				SomaTotalImpar+=numero;
				ContImpar++;
			}
			
			
		}

		
			System.out.println("\nO valor da soma dos numeros pares é de: "+SomaTotalPar);
			System.out.println("\nO valor da soma dos numeros ímpares é de: "+SomaTotalImpar);
			System.out.println("\nA quantidade de numeros pares foi de: "+ContPar);
			System.out.println("\nA quantidade de numeros ímpares foi de: "+ContImpar);
	}

}
