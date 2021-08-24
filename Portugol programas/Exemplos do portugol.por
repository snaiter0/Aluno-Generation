programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia nome = "Tainan"
		inteiro idade,a=3, b=8
		real altura,nota1,nota2,nota3,media
	
		escreva("\nQual a sua idade? ")
		leia(idade)
		escreva("\nQual sua altura? ")
		leia(altura) // criar um ocmentário na linha de código
		//neste momento eu já tenho a idade e a altura do meu/mminha usuario/a
		

	 escreva("\nEntre com a primeira nota: ")
	 leia(nota1)
	 escreva("\nEntre com a segunda nota: ")
	 leia(nota2)
	 escreva("\nEntre com a terceira nota: ")
	 leia(nota3)

	 media = (nota1 + nota2 + nota3) / 3
	 
	 
	 escreva("\nNome da pessoa: ", nome)
	 escreva("\nIdade da pessoa: ", idade)
	 escreva("\nAltura da pessoa: ", altura)
	 escreva("\nA média da pessoa: ", nome," foi de: ", media)


	nota1 = mat.raiz(nota2,2.0)
	nota2 = mat.potencia(nota3,3.0)
	nota3 = a % b
	escreva("\nRaiz quadrada da nota2: ", mat.arredondar(nota1, 2))
	escreva("\nNota3 ao cubo: ", mat.arredondar(nota2, 2))
	escreva("\nResto da divisão de A por B: ",mat.arredondar(nota3, 3))
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1044; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */