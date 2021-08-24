programa
{
	inclua biblioteca Util

/*
4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal. 
 */
	
	funcao inicio()
	{
		inteiro M1[3][3],linha,coluna,Total=0,Soma_diagonal


		

		para(linha=0;linha<3;linha++){

			para(coluna=0;coluna<3;coluna++){

				M1[linha][coluna]=Util.sorteia(1, 9)

				escreva("\nO valor da linha: ", linha+1," coluna: ",coluna+1," da matriz M1 é: ",M1[linha][coluna])
				Total+= M1[linha][coluna]

				


				
			}
		}

		limpa()


		escreva("\nO valor total dos valores inseridos na matriz é de: ", Total)
		escreva("\n")
		escreva("\nO valor da diagonal principal da matriz é: ", M1[0][0]+M1[1][1]+M1[2][2])
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 13, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */