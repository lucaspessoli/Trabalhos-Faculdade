/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhocarlao;

/**
 *
 * @author aluno
 */
public class TrabalhoCarlao {

    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel triangulo = new Triangulo();
        Desenhavel retangulo = new Retangulo();
        
        circulo.desenhar();
        triangulo.desenhar();
        retangulo.desenhar();
    }
}
