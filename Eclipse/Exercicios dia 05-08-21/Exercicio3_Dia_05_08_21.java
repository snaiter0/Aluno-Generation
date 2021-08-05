package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio3_Dia_05_08_21 
{

	public static void main(String[] args) 
	{
		int[][] Valores = new int[3][3];
		int Maior10 = 0,Menor10 = 0;
		Scanner leia = new Scanner(System.in);
		
		
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.println("\nInsira um valor: ");
				Valores[x][y]=leia.nextInt();
				
				if(Valores[x][y]>10)
				{
					Maior10++;
					System.out.println("\nO valor insirido com sucesso.");
				}
				
				else if(Valores[x][y]<10)
				{
					Menor10++;
					System.out.println("\nO valor insirido com sucesso.");
				}
				
				else 
				{
					System.out.println("O valor inserido foi igual à 10 e será desconsiderado.");
				}
				
			}
		}
		System.out.println("\nA quantidade de numeros maiores que 10 é: "+Maior10);
		System.out.println("\nA quantidade de numeros menor que 10 é: "+Menor10);
	}
	
}

