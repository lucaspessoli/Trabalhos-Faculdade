/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhocarlao;

/**
 *
 * @author aluno
 */
public interface Desenhavel {
    
    void desenhar();

}

class Circulo implements Desenhavel {
 
    public void desenhar(){
        System.out.println("circulo desenhado");
    }
}

class Retangulo implements Desenhavel {
 
    public void desenhar(){
        System.out.println("retangulo desenhado");
    }
}

class Triangulo implements Desenhavel {
 
    public void desenhar(){
        System.out.println("triangulo desenhado");
    }
}

