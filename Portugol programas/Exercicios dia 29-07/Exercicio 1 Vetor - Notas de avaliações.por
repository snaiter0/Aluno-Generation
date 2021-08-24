programa
{
	/*
1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	*/


	
	funcao inicio()
	{

	real notas[5], MaiorNota=0.0
	inteiro x=0
	
		

		para(x=0;x<5;x++)
		{
		escreva("\nInsira a nota da atividade ", x+1,": ")
		leia(notas[x])
		
		se(notas[x]>MaiorNota)
		{
			MaiorNota = notas[x]
		}
		
		}

		limpa()
		para(x=0;x<5;x++){

			escreva("\nA pontuação da atividade", x+1, " é de: ", notas[x])
		}
		escreva("\nA atividade com a maior pontuação teve nota de: ",MaiorNota)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */