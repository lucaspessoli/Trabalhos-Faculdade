programa
{
	
	funcao inicio()
	{
		cadeia nome1
		inteiro resultado
		inteiro resultado2
		inteiro resultado3
		
		nome1 = primeira()
		escreva(nome1)

		resultado = somar()
		escreva (resultado)
		formatacao()

		resultado2 = multiplicar()
		escreva(resultado2)
		formatacao()

		resultado3 = divisao()
		escreva(resultado3)
		formatacao()
		apresentaMensagem()

	}

	funcao apresentaMensagem(){
		escreva ("Mensagem denro da função!")
	}

	funcao inteiro somar(){
		inteiro doisNumeros = 2+6
		retorne doisNumeros
	}

	funcao inteiro multiplicar(){
		escreva("\n")
		inteiro multiNumeros = 2 * 4
		retorne multiNumeros
	}

	funcao inteiro divisao(){
		escreva("\n")
		inteiro divisaoNumeros = 16/4
		retorne divisaoNumeros
	}

	funcao formatacao(){
		escreva("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n")
	} 

	funcao cadeia primeira(){
		cadeia retorno = ("Portugol \n")
		retorne retorno
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */