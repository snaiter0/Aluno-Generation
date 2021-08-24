programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

	inteiro A, B, C //Variaveis do problema
	inteiro D, R, S //valor resultante das somas
	

	
	escreva("\nInsira o valor de A: ")
	leia(A)
	escreva("\nInsira o Valor de B: ")
	leia(B)
	escreva("\nInsira o Valor de C: ")
	leia(C)


	

	
	R = (A+B) 
	R = mat.potencia(R,2)
	S = (B+C)
	S = mat.potencia(S,2)
	D = (R+S)/2
	
	

	escreva("\nO resultado da equação de S igual a: ", S)
	escreva("\nO resultado da equação de R igual a: ", R)
	escreva("\nO resultado da equação é igual a: ", D)

	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */