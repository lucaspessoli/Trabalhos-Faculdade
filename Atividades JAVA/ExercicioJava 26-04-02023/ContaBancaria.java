/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;
    
    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    
    public void ExibeDados(){
        System.out.println("Nome cliente: " + getCliente() + "Numero da conta: " + getNum_conta() + "Saldo atual: " + getSaldo());
    }
    
    public void Depositar(float valor){
        ExibeDados();
        setSaldo(saldo + valor);
        System.out.println("Saldo depositado, novo saldo: " + getSaldo());
    }
    
    public void SacarCB(float valor){
        ExibeDados();
        if(valor > this.saldo){
            System.out.println("Você não tem tudo isso para sacar!");
        }else{
            setSaldo(saldo - valor);
            System.out.println("Saldo extraido, total do saque: " + getSaldo());
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
