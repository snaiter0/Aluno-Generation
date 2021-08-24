programa
{
	inclua biblioteca Matematica --> mat
	
	/*

1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.

	*/

		

	
	funcao inicio()
	{
	
	inteiro filhos, Renda, x, Maior_salario =0, Percentagem=0
	real Media_Salario =0.0, Media_Filhos=0.0
	
		
		
		para(x=1;x<=5;x++)
		
		{
			
			escreva("\nInsira o numero de Filhos: ")
			leia(filhos)
			escreva("\nInsira a renda familiar: ")
			leia(Renda)

			Media_Salario += Renda 
			Media_Filhos += filhos

			
			se (Renda>Maior_salario)	{
				Maior_salario = Renda
			}

			se(Renda>100)	{
				Percentagem++
			}

			limpa()
			
		}

		escreva("\nA media de salarios da população é de: R$", Media_Salario/5)
		escreva("\nA media de filhos da população é de: ", Media_Filhos/5)
		escreva("\nO maior salario é de: ", Maior_salario)
		escreva("\nA porcentagem de habitantes com renda superior a R$100 é de: ", Percentagem * 20,"%")



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 967; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */