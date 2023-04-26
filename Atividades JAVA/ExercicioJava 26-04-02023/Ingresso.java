/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class Ingresso {
    private float valorIngresso = 20;
    
    public Ingresso(float valor){
        this.valorIngresso = valor;
    }
    
    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public String toString(){
        return "O total é: " + valorIngresso;
    }
}
