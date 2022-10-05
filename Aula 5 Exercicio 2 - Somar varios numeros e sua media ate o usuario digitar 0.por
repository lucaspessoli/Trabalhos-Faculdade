programa
{
	inclua biblioteca Internet
	
	funcao inicio()
	{
	inteiro num, s, m, cont

	s = 0
	m = 0
	cont = 2
	
		escreva("Informe seu numero")
		leia(num)

		enquanto ( num !=0) {
			s = s + num
			m = (s / (cont-1))
			escreva("Seu numero: ", s)
			escreva("informe novamente")
			leia(num)
			cont++
			
		}
		escreva("Soma: " + s + "\nMédia: " + m)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */