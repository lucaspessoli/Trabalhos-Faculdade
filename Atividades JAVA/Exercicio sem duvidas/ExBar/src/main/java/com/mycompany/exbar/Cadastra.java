/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exbar;

/**
 *
 * @author aluno
 */
public class Cadastra {
    
    private String nomeBar;
    private String data;
    private String pedido;
    private double valor;
    private int talMesa;
    
    public void setNomeB(String nome){
        nomeBar = nome;
    }
   
    
    public void setMesa(int nam){
        talMesa = nam;
    }
    
    
    public void setPedido(String pedido1){
        pedido = pedido1;
    }
    
    
    public void setData(String datan1){
        data = datan1;
    }
    
    
    public void setValor(double valordoPedido){
        valor = valordoPedido;
    }
    
    
    public double getValor(){
        return valor;
    }
    
    
}
