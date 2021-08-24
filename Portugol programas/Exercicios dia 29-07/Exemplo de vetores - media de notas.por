programa
{
	
	funcao inicio()
	{
		real notas[10],maiornota=0.0,somanota=0.0,medianota
		inteiro x
		cadeia nome[] = {"João","Maria"," "}

		
		para(x=0;x<10;x++)
		{
			escreva("\nEntre com a sua nota: ") // 7.56 8.6  6.5
			leia(notas[x])

			se(maiornota<notas[x])
			{
				maiornota = notas[x]
			}

			somanota = somanota + notas[x]
		}

		limpa()

		para(x=0;x<10;x++)
		{
			escreva("\nNota ",x+1," : ",notas[x])
		}
		escreva("\nPosição 4 do meu vetor notas: ",notas[3])
		medianota = somanota / 10
		escreva("\nA média das notas foi de: ",medianota)
		
		escreva("\nMaior nota foi: ",maiornota)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */