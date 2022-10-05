programa
{
	
	funcao inicio()
	{
		inteiro num1,num2,num3

		escreva("Escreva seu primeiro número: ")
		leia (num1)
		escreva("Escreva seu segundo número: ")
		leia (num2)
		escreva("Escreva seu terceiro número: ")
		leia (num3)

		se (num1 < num2 e (num1 < num3)){
			escreva("O primeiro número é o menor entre eles")
			
		}senao se (num2 < num3) {
			escreva("O segundo número é o menor entre eles")
		}senao{
			escreva("O terceiro número é o menor entre eles")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */