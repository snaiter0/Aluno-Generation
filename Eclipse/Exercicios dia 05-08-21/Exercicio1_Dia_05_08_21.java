package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio1_Dia_05_08_21 
{

	public static void main(String[] args) 
	{
		int A[] = new int [6];
		Scanner leia = new Scanner(System.in);
		int VariavelSimples=0;
		
		
		System.out.println("");
		
		A[0]=1;
		A[1]=0;
		A[2]=5;
		A[3]=-2;
		A[4]=-5;
		A[5]=7;
		
		
		for(int x=0;x<6;x++)
		{
			if(x==4)
			{
				System.out.println("\n");
				System.out.println("\nO valor de A[4] foi alterado de: "+A[4]+" para: 100.");
				System.out.println("\n");
				A[x]=100;
			}
		
			System.out.println("\n O valor de A na posição: "+x+" é de: "+A[x]);
		}
		VariavelSimples+=A[0]+A[1]+A[5];
		System.out.println("Uma variavel simples equivale a soma das posições 0,1 e 5 do vetor A, resultando no total de: "+VariavelSimples);
		
	}
}
