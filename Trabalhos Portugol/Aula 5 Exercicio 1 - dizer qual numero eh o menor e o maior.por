programa
{
	
	funcao inicio()
	{
	inteiro num, n_mai, n_men, i

	escreva("Informe seu numero inteiro")
	leia(num)
	n_mai=num
	n_men=num
		para(i=0;i<10;i++){
			escreva("Informe seu numero inteiro")
			leia(num)

		se(num>n_mai){
			n_mai=num
		}senao{
			se (num<n_men){
				n_men=num
			}
		}
		}
	
	escreva("O maior numero informado foi: " + n_mai)
	escreva("\nO menor numero informado foi: " + n_men)
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */