programa
{
	
	funcao inicio()
	{
		inteiro x,y,resultado
		logico v, f
		
		
		v = verdadeiro

		
		escreva("Resultado: " + v)
		escreva("Digite x")
		leia(x)
		escreva("Digite y")
		leia(y)
		resultado = x + y

		se (resultado < 9) {
			escreva("CHANCE BAIXA")
		}senao se (resultado <75) {
			escreva("CHANCE ALTA")
		}senao{
			escreva("nao")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */