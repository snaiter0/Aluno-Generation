programa
{
	/*
Elabore um sistema que leia as variaveis c e n, respectivamente código e numero de horas trabalhadas de um operario
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o numero de horas exceder a 50 calcule o
excesso de pagamento armazenando- na variavel E, caso contrario zerar tal variavel. A hora excedente de trabalho
vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.

	*/
	


	

	
	funcao inicio()
	{

		inteiro C, N, Hora_Extra, Hora_Maxima, Pagamento_Normal




		escreva("\nInsira a carga horaria normal: ")
		leia(Hora_Maxima)
		escreva("\nInsira o valor da hora extra: ")
		leia(Hora_Extra)
		escreva("\nInsira suas horas trabalhadas: ")
		leia(C)


		se(C>=50) {

		N = (C - Hora_Maxima)
		Pagamento_Normal = (C-N)*10  

		escreva("Seu salario total com horas extras foi de: R$", (Hora_Extra*N) + Pagamento_Normal, "\nO adicional foi de: R$", (Hora_Extra*N))
		}
		
		senao
		escreva("Seu salario total foi de: R$", C*10)
	
		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1010; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */