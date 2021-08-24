programa
{

/*
 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo. 
 
 */
	
	funcao inicio()
	{
		inteiro Valor=0, Valor_Total=0, Contagem =0
		real Valor_Medio
	
		enquanto(Valor>=0){
		escreva("\nInsira um novo valor: ")
		leia(Valor)

		

		Valor_Total += Valor
		Contagem++
		Valor_Medio = Valor_Total/Contagem

		escreva("\n O Valor total é de: ", Valor_Total)
		escreva("\n O Valor médio é de: ", Valor_Medio)
		escreva("\n A quantidade de valor fornecidos foi de: ", Contagem)
		

		
			
		}
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 770; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */