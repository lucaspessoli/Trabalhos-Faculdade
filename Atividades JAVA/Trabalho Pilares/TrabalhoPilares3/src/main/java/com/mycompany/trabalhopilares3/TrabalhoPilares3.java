/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares3;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares3 {

    public static void main(String[] args) {
        
        //3 - Crie uma classe chamada ContaCorrente que herda da classe ContaBancaria e possui um método para calcular o valor do cheque especial, disponivel para o titular da conta
        
        ContaCorrente contaCorrente = new ContaCorrente(2500, "Lucas");
        
        contaCorrente.calcularValorCheque();
    }
}
