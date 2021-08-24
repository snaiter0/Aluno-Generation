programa
{
	/*
	3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	*/


	
	funcao inicio()
	{
		real Primeiro_Quadrado, Segundo_Quadrado, Terceiro_Quadrado, Quarto_Quadrado


		escreva("\nInsira o valor do primeiro quadrado: ")
		leia(Primeiro_Quadrado)
		escreva("\nInsira o valor do segundo quadrado: ")
		leia(Segundo_Quadrado)
		escreva("\nInsira o valor do terceiro quadrado: ")
		leia(Terceiro_Quadrado)
		escreva("\nInsira o valor do quarto quadrado: ")
		leia(Quarto_Quadrado)


		Primeiro_Quadrado = Primeiro_Quadrado*Primeiro_Quadrado
		Segundo_Quadrado = Segundo_Quadrado*Segundo_Quadrado
		Terceiro_Quadrado = Terceiro_Quadrado*Terceiro_Quadrado
		Quarto_Quadrado = Quarto_Quadrado*Quarto_Quadrado
		
	se(Terceiro_Quadrado>=1000){
		escreva("\nO valor do terceiro quadrado é: ", Terceiro_Quadrado)
		
	}
	
		senao
		escreva("\nO valor do primeiro quadrado é: ", Primeiro_Quadrado, "\nO valor do segundo quadrado é: ",Segundo_Quadrado, "\nO valor do terceiro quadrado é: ", Terceiro_Quadrado, "\nO valor do quarto quadrado é: ", Quarto_Quadrado)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1108; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */