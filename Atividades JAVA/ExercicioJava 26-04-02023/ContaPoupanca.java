/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;
    
    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento){
        super(cliente,num_conta,saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public void CalcularNovoSaldo(float salario){
        System.out.println("A taxa rendimento do dia: " + diaRendimento + "irá render: " + (diaRendimento + 3) 
            + "Seu novo saldo será: ");
        setSaldo((getSaldo()) + (diaRendimento + 3));
        System.out.println(getSaldo());
    }
    
    
}
