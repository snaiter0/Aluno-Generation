programa
{
	
	funcao inicio()
	{

		real P, Excesso, Multa  


		escreva("\nInsira o valor considerado excesso de peso em tomates: ")
		leia(Excesso)
		escreva("\nColoque o saco de tomates na balança: ")
		leia(P)

		se(P>=Excesso) 
		{
		Multa = P-Excesso
		escreva("\n Você foi taxado em: R$", Multa*4.00)	
		}
		senao
			escreva("\n Você não foi taxado.")
		
		}



		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */