programa {
	funcao inicio() {
		inteiro salario, horasmensal, resultado
		
		escreva("Qual seu sálario: ")
		leia(salario)
		
		escreva("Quantas horas você trabalha por mês: ")
		leia(horasmensal)
		
		resultado = (salario / horasmensal)
		
		escreva("Você recebe: "+ resultado + " por hora.")
	}
}
