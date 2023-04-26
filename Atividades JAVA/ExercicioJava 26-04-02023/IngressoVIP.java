/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class IngressoVIP extends Ingresso {
    public float valorAdicional = 20;
    
    public IngressoVIP(float valorIngresso) {
        super(valorIngresso);
        
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String toString(){
        return "O valor do ingresso VIP é: "+ (valorAdicional + super.getValorIngresso());
    }
    
    
    
}
