package Turma29_Inicio;

import java.util.Scanner;

public class Exercicio4_Dia_05_08_21 
{
	public static void main(String[] args) 
	{
		int[][] M1= new int[2][2];
		int[][]	M2= new int[2][2]; 
		int[][] ExecutaMatriz = new int[2][2]; 
		int Menu = 0,M=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(M=0;M<2;M++)
		{
			
			
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<2;y++)
			{
				
				
				
				if(M==1)
				{
						System.out.println("Bem vindo ao menu, insira um dos 4 comandos: \n"
						+ "(1) somar as duas matrizes \r\n"
						+ "(2) subtrair a primeira matriz da segunda \r\n"
						+ "(3) adicionar uma constante as duas matrizes\r\n"
						+ "(4) imprimir as matrizes \r\n");
				
				Menu=leia.nextInt();
				
				switch(Menu) 
				{
				case 1:
					
					for(x=0;x<2;x++)
					{
						for(y=0;y<2;y++)
						{
					 
							ExecutaMatriz[x][y] = M1[x][y] + M2[x][y];
							System.out.println("A soma das matrizes resulta na seguinte nova matriz: "+ExecutaMatriz[x][y]);
					
						}
					}
					break;
					
				case 2:
					for(x=0;x<2;x++)
					{
						for(y=0;y<2;y++)
						{
					 
							ExecutaMatriz[x][y]= M1[x][y]-M2[x][y];
							System.out.println("A subtração das matrizes resulta na seguinte nova matriz: "+ExecutaMatriz[x][y]);
					
						}
					}
					break;
					
				case 3:
					for(x=0;x<2;x++)
					{
						for(y=0;y<2;y++)
						{
							
							if(x==0 && y==1)
							{
								final int Constante = 3;
								M1[x][y]+= Constante;
								M2[x][y]+= Constante;
								System.out.println("\n\rNova constante adicionada, na posicao x: "+x+", y:"+y+". O valor dela é: "+Constante);
							}
					
							System.out.println("\nValor na Matriz 1 na posição x"+x+": e Y"+y+": é de:"+ M1[x][y]);
							System.out.println("\nValor na Matriz 2 na posição x"+x+": e Y"+y+": é de:"+ M2[x][y]);
						}
					}
					break;
					
				case 4:
				
					System.out.println("IMPRESSAO DAS MATRIZES 1 e 2: ");
				for(x=0;x<2;x++)
				{
				
					for(y=0;y<2;y++)
					{
						
						System.out.println("\nValor na Matriz 1 na posição x"+x+": e Y"+y+": é de:"+ M1[x][y]);
						
						System.out.println("\nValor na Matriz 2 na posição x"+x+": e Y"+y+": é de:"+ M1[x][y]);
						
						
				
				
					}
				}
				break;
			}
		}
		
		else
		
		{
			System.out.println("\n Insira o valor na Matriz 1 na posição x"+x+": e Y"+y+": ");
			M1[x][y]= leia.nextInt();
			System.out.println("\n Insira o valor na Matriz 2 na posição x"+x+": e Y"+y+": ");
			M2[x][y]= leia.nextInt();
		}
			}
		
			
			
			}
	
		}
	}
}
