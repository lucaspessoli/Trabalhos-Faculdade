/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {
    private float limite;
    
    public ContaEspecial(String cliente, int num_conta, float saldo, float limite){
        super(cliente,num_conta,saldo);
        this.limite = limite;
    }
    
    public void ExibeDados(){
        System.out.println("Conta do cliente:" + getCliente() + ", número da conta: " + getNum_conta() + ", novo saldo :" + getSaldo());
    }    
    
    public void Sacar(float d){
        ExibeDados();
        float l = super.getSaldo() - d;
        if(l >= limite){
            setSaldo(l);
            System.out.println("Saldo sacado com sucesso! novo saldo:" + getSaldo());
        }else{
            System.out.println("Seu limite atual não permite sacar tanto dinheiro!");
        }
    }
}
