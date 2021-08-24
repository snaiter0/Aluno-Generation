programa
{
	inclua biblioteca Matematica --> mat

	
	funcao inicio()
	
	{
		
 
	inteiro minutos,segundos,horas

	escreva("\nQual o tempo de duração do processo (horas): ")
	leia(segundos)
	escreva(segundos," segundos")

	
	minutos = (segundos%60) 
	horas = (segundos/60/60)
	segundos =(minutos%horas)
	

	escreva("\nO processo durará: ",horas," horas ou " ,minutos," minutos ou ",segundos," segundos")
	
	 
	
     

		
	





		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */