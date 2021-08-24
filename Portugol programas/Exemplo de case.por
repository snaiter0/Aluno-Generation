programa
{
	
	funcao inicio()
	{
		real primeiro, segundo, resultado
		caracter operador

		
		escreva("\nEntre com o primeiro valor: ")
		leia(primeiro)
		escreva("\nEntre com o segundo valor: ")
		leia(segundo)

		escreva("\n+ -- Soma \n- -- Diferença\n* -- Multiplicação\n/ -- Divisão")
		escreva("\n entre com o operação que deseja: ")
		leia(operador)

		escolha(operador)
		{
		 caso '+': 
		resultado = primeiro + segundo
		escreva("\nResultado: ", resultado)
		pare
		
		caso '-':
		resultado = primeiro - segundo
		escreva("\nResultado: ", resultado)
		pare

		caso '*':
		resultado = primeiro * segundo
		escreva("\nResultado: ", resultado)
		pare

		caso '/':
		se(segundo==0){
			escreva("\nNão existe divisão por 0")
		}
		senao
		{
		resultado = primeiro / segundo
		escreva("\nResultado: ", resultado)
		}
		pare
		
		caso contrario:
		escreva("\nOperador não reconhecido!!!")
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 811; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */