programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,media,somamedia=0.0,mediageral
		inteiro x

		para(x=1;x<=4;x++) // x = x + 1 x = x+2  x-- é igual a x = x - 1
		{
			escreva("\nEntre com N1: ")
			leia(n1)
			escreva("\nEntre com N2: ")
			leia(n2)
			escreva("\nEntre com N3: ")
			leia(n3)

			media = (n1 + n2 + n3) / 3
			escreva("\nMédia alune ",x,": ",media) //7.5  3.0  5.5 4.0

			se(media>=7.0 e media<=10.0)
			{
				escreva("\nAlune aprovade...")
			}
			senao se(media>=5.0 e media<7.0)
			{
				escreva("\nAlune de exame...")
			}
			senao
			{
				escreva("\nAlune reprovade...")
			}

			somamedia = somamedia + media  // somamedia = somamedia + media
			
		}

		mediageral = somamedia / 4

		se(mediageral>=7.0)
		{
			escreva("\nParabéns, essa turma é excelente!!!")
		}

		escreva("\nMédia geral: ",mediageral)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */