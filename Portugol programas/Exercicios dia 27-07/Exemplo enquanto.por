programa
{
	
	funcao inicio()
	{
		inteiro numero,contpar=0,contimpar=0

		escreva("\nEntre com um número: ")
		leia(numero) // 7
		
		enquanto(numero!=0)
		{
			se(numero % 2 == 0)
			{
				contpar++ // contpar = contpar + 1 // 1
			}
			senao
			{
				contimpar++ // 1
			}
			//numero=0
			escreva("\nEntre com um número: ") // 2 0
			leia(numero)
		}

		escreva("\nTemos: ",contpar," número(s) par(es) e ",contimpar," número(s) impar(es)")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */