programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3],contpar=0,somaimpar=0,linha,coluna

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um número: ")
				leia(numeros[linha][coluna]) // 10

				se(numeros[linha][coluna] % 2 == 0)
				{
					contpar++
				}
				senao
				{
					somaimpar = somaimpar + numeros[linha][coluna]
				}
			}
		}
			para(linha=0;linha<3;linha++)
			{
				para(coluna=0;coluna<3;coluna++)
				{
					escreva("\nElementos da matriz: ",numeros[linha][coluna])
				}
			}
		
		escreva("\nElementos da matriz: ",numeros[0][1])
		escreva("\nQuantidade de números pares foi de: ",contpar)
		escreva("\nSomatório dos números impares foi de: ",somaimpar)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 737; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */