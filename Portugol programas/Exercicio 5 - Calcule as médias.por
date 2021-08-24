programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real Media_1, Media_2, Media_3

		escreva("\n insira o valor da média 1: ")
		leia(Media_1)
		escreva("\n insira o valor da média 2: ")
		leia(Media_2)
		escreva("\n insira o valor da média 3: ")
		leia(Media_3)

		real Media_total = (Media_1 + Media_2 + Media_3) / 3
		
		escreva("\n O valor total da média é: ", mat.arredondar(Media_total, 2))
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */