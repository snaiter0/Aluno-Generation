programa
{
	/*
A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos 
de indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas
a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo
são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem
ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emite a notificação adequada aos diferentes grupos de empresas.
	*/



	
	funcao inicio()
	
	{
		real poluicao
		inteiro nivel_de_poluicao = 0


		escreva("\n insira o índice de poluicao: ")
		leia(poluicao)
		
	
		se(poluicao>=0.05 e poluicao<=0.25) {
			nivel_de_poluicao = 1
		}

		senao se(poluicao>=0.3 e poluicao<=0.49) {
			nivel_de_poluicao = 2
		}

		senao se(poluicao>=0.5) {
			nivel_de_poluicao = 3
		}

		escolha(nivel_de_poluicao){
		caso 1:
		escreva("\nO nível de poluição alcançou o nivel alto, o grupo 1 deve paralisar suas atividades")
		pare
		
		caso 2:
		escreva("\nO nível de poluição alcançou o nível perigoso, o grupo 1 e 2 deve paralisar suas atividades")
		pare

		caso 3:
		escreva("\nO NÍVEL DE POLUIÇÃO ULTRAPASSOU O NIVEL CRÍTICO TODOS OS GRUPOS DEVEM PARALISAR SUAS ATIVIDADES!!!")
		pare

		caso 0:
		escreva("O nível de poluição está aceitavel")
		

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */