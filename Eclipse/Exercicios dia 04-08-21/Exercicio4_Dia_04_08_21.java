package Turma29_Inicio;
import java.util.Scanner;

public class Exercicio4_Dia_04_08_21 
{
	public static void main(String[] args) 
	{
		int idade,pessoas=0,feminino,masculino,outros,temperamento,sexo,Menor18calma = 0,Maior40Nervosa = 0,OutroCalmo = 0,HomensAgressivos = 0,MulheresNervosas = 0,PessoasCalmas = 0;
		Scanner leia = new Scanner(System.in);
		
		//Pesquisa anonima		

		while(pessoas<3)
		{
			System.out.println("Insira sua idade: ");
			idade=leia.nextInt();
			
			
			System.out.println("Insira seu sexo: "+"\n 1= feminino "+"\n 2= masculino "+"\n 3= outros");
			sexo=leia.nextInt();
			while(sexo>3 || sexo<=0) 
			{
				System.out.println("\nCódigo não identificado");
				System.out.println("\nInsira seu sexo: "+"\n 1= feminino "+"\n 2= masculino "+"\n 3= outros");
				sexo=leia.nextInt();
			}
			
			
			System.out.println("Insira seu temperamento: "+"\n 1= calma "+"\n 2= nervosa "+"\n 3= agressiva");
			temperamento=leia.nextInt();
			
			while(temperamento>3 || temperamento<=0) 
			{
			System.out.println("\nCódigo não identificado");
			System.out.println("Insira seu temperamento: "+"\n 1= calma "+"\n 2= nervosa "+"\n 3= agressiva");
			temperamento=leia.nextInt();
			}
			
			
			if(temperamento == 1)
			{
				PessoasCalmas++;
			}
			
			if(sexo==1 && temperamento==2)
				
			{
				MulheresNervosas++;
			}
			
			if(sexo==2 && temperamento ==3)
			{
				HomensAgressivos++;
			}
			
			if(sexo==3&&temperamento==1)
			{
				OutroCalmo++;
			}
			
			if(idade>40 && temperamento==3)
			{
				Maior40Nervosa++;
			}
			
			if(idade<18&&temperamento==1)
			{
				Menor18calma++;
			}
			
			
			pessoas++;
		}
		
		System.out.println("\nNumero de pessoas calmas: "+PessoasCalmas);
		System.out.println("\nNumero de mulheres nervosas: "+MulheresNervosas);
		System.out.println("\nNumero de homens agressivos: "+HomensAgressivos);
		System.out.println("\nNumero de pessoas nervosas com mais de 40 anos: "+Maior40Nervosa);
		System.out.println("\nNumero de outros calmos: "+OutroCalmo);
		System.out.println("\nNumero de pessoas calmas com menos de 18: "+Menor18calma);
		
	}
}
