/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabalhopilares;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares {

    public static void main(String[] args) {
        //1 -Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato "calcularArea()". Em seguida crie duas subclasses chamadas "Retangulo"
        //e "Circulo" que herdam da classe "FormaGeometrica" e implementa o método "CalcularArea()" de maneiras diferentes.

        FormaGeometrica forma = new FormaGeometrica();
        Retangulo retangulo = new Retangulo(3, 5);
        Circulo circulo = new Circulo(5, 4);

//        System.out.println(forma.CalcularArea());;
        System.out.println(retangulo.CalcularArea());
        System.out.println(circulo.CalcularArea());
    }
}
