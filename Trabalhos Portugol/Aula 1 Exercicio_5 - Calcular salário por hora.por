programa {
	funcao inicio() {
		inteiro salario, horasmensal, resultado
		
		escreva("Qual seu s�lario: ")
		leia(salario)
		
		escreva("Quantas horas voc� trabalha por m�s: ")
		leia(horasmensal)
		
		resultado = (salario / horasmensal)
		
		escreva("Voc� recebe: "+ resultado + " por hora.")
	}
}
