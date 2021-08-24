programa
{
	inclua biblioteca Util
	/*
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
	*/
	funcao inicio()
	{
		inteiro dados[10], x, Rep_do_Maior_Valor=0, Maior_Valor =0
		real  Media=0.0

		
		para(x=0;x<10;x++)
		{
			escreva("\nInsira o valor do dado: ")
			dados[x] = Util.sorteia(1, 10)


			

			
			
			se(dados[x]>Maior_Valor)
			{
				
				Maior_Valor = dados[x]	
				Rep_do_Maior_Valor=0
				
					
			}

			se(dados[x] == Maior_Valor)
			{
			 Rep_do_Maior_Valor++
			}

			
			
			
			Media += dados[x]

			
			escreva("\nO valor do dado: ",x+1, " rolado foi: ",dados[x])
			
			}

			escreva("\n")
			escreva("\nO maior valor do dado rolado foi: ", Maior_Valor)
			escreva("\n")
			escreva("\nA repetição do rolado foi de: ", Rep_do_Maior_Valor, " vezes")
			escreva("\n")
			escreva("\nA média dos valores rolados foi de: ", Media/x)


			
			
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dados, 12, 10, 5}-{x, 12, 21, 1}-{Rep_do_Maior_Valor, 12, 24, 18}-{Maior_Valor, 12, 46, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */