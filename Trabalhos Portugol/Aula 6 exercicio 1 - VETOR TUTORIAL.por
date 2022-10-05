programa
{
	
	funcao inicio()
	{
		escreva("Vetores")
		
		inteiro numero [10]
		//Lendo Numeros
		para (inteiro i=0; i<=9; i++) {
			leia(numero[i])//variavel contadora
		}
	
	//escrevendo os numeros
	para (inteiro i=0; i<=9; i++){
		escreva(numero[i]," - ")
	}
	escreva("\n")
	//mostrar os numeros ao contrario
	para (inteiro y=9; y>=0;y--){
		escreva (numero[y]," - ")
	}

	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */