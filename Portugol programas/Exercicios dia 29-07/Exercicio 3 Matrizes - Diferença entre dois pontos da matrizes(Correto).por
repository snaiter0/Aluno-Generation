programa
{
	inclua biblioteca Tipos
	inclua biblioteca Util
	/*
3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
	*/


	
	funcao inicio()
	{
		inteiro M1[4][6], M2[4][6], N1[4][6], N2[4][6], linha,coluna,total
		

		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			M1[linha][coluna] = Util.sorteia(1, 10)
			M2[linha][coluna] = Util.sorteia(1, 10)

			escreva("\nMatriz 1. O valor inserido na linha:", linha+1," da coluna:" ,coluna+1, " é de:", M1[linha][coluna])
			escreva("\nMatriz 1. O valor inserido na linha:", linha+1," da coluna:" ,coluna+1, " é de:", M2[linha][coluna])
			
			N1[linha][coluna]=M1[linha][coluna]+M2[linha][coluna]
			N2[linha][coluna]=M1[linha][coluna]-M2[linha][coluna]
			}
		}

/*
			para(linha=0;linha<4;linha++)
			{
				para(coluna=0;coluna<6;coluna++)
				{
				
					escreva("\nO valor de soma entre M1 e M2 na linha: ",linha, " coluna: ", coluna, " é de: ", M1[linha][coluna]+M2[linha][coluna])
					}
			}
			

			para(linha=0;linha<4;linha++)
			{
				para(coluna=0;coluna<6;coluna++)
				{

				escreva("\nA diferença de valor entre M1 e M2 na linha: ",linha, " coluna: ", coluna, " é de: ", M1[linha][coluna]-M2[linha][coluna])
				
				

				}
			}
			limpa()
*/
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 959; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 17, 10, 2}-{M2, 17, 20, 2}-{N1, 17, 30, 2}-{N2, 17, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */