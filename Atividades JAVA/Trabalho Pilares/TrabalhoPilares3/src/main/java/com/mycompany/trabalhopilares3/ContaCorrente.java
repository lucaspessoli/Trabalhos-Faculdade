/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopilares3;

/**
 *
 * @author aluno
 */
public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(double saldo, String titular){
        super(saldo,titular);
    }
    
    public void calcularValorCheque() {
        double valorMensal = this.getSaldo()/12;
        
        System.out.println("O valor pago por mês será: " + valorMensal);
    }
    
}
