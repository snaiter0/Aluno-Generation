programa
{
	inclua biblioteca Matematica --> mat	

	
	funcao inicio()
	{

		real X1, X2, Y1 , Y2, D
		
		escreva("\n Digite o valor de X1: ")
		leia(X1) 
		escreva("\n Digite o valor de X2: ")
		leia(X2)
		escreva("\n Digite o valor de Y1: ")
		leia(Y1)
		escreva("\n Digite o valor de Y2: ")
		leia(Y2)

		D=mat.raiz(mat.potencia((X2-X1),2.0)+mat.potencia((Y2-Y1),2.0),2.0)

		escreva ("\n A distancia no vetor é: ", D)

		

		


		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */