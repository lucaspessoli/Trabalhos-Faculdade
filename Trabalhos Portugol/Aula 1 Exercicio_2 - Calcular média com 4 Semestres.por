programa {
	funcao inicio() {
		
		inteiro ra, nota1, nota2, nota3, nota4, soma, final
		
		escreva("Informe seu RA: ")
		leia(ra)
		
		escreva("Informe sua nota1: ")
		leia(nota1)
		
		escreva("Informe sua nota2: ")
		leia(nota2)
		
		escreva("Informe sua nota3: ")
		leia(nota3)
		
		escreva("Informe sua nota4: ")
		leia(nota4)
		
		soma = (nota1 + nota2 +nota3+ nota4)
		
		final = (soma / 4)
		
		escreva("Bem vindo RA: " + ra, " Sua média: "final)
		
	}
}
