programa
{
	
	funcao inicio()
	{
		inteiro joao, maria, lucas

		escreva("idade do primeiro joao: ")
		leia(joao)
		escreva("idade do segundo maria: ")
		leia(maria)
		escreva("idade do terceiro lucas: ")
		leia(lucas)

	se ((joao > maria e (joao > lucas))) {
		escreva("Joao é o filho mais velho")
		
	}senao se ((maria > joao e (maria > lucas))){
		escreva("Maria é a mais velha")
		
	}senao se ((lucas > maria e (lucas > joao))) {
		escreva("Lucas é o mais velho")
	}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */