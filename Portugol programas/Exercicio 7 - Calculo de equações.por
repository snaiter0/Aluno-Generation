programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A,B,C,D,E,F // Variaveis
		real X, Y // Resultados

	
	escreva("\nInsira o valor de A: ")
	leia(A)
	escreva("\nInsira o valor de B: ")
	leia(B)
	escreva("\nInsira o valor de C: ")
	leia(C)
	escreva("\nInsira o valor de D: ")
	leia(D)
	escreva("\nInsira o valor de E: ")
	leia(E)
	escreva("\nInsira o valor de F: ")
	leia(F)
	

	X = ((C*E) - (B*F)) / ((A*E) - (B*D))
	Y = ((A*F) - (C*D)) / ((A*E) - (B*D))


	escreva("O valor de X É:", mat.arredondar(X, 2))
	escreva("O valor de Y É:", mat.arredondar(Y, 2))
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */