programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro Carro, Valor_Total
		real Imposto = 0.45
		real TaxaProducao = 0.28
	escreva("Qual o valor de produção do carro ?")
	leia(Carro)

	Valor_Total = Carro
	Carro = (Imposto+TaxaProducao)*Carro
	escreva("\n A taxa sobre o valor do carro será: ", Carro)
	escreva("\n O valor total do veículo será: ", Carro+Valor_Total)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */