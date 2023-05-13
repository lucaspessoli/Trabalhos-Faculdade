/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciooverload;

/**
 *
 * @author lucas
 */
public class ExercicioOverload {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int[] lista = new int[5];
        lista[0] = 1;
        lista[1] = 5;
        lista[2] = 3;
        lista[3] = 2;
        lista[4] = 7;
        
        System.out.println(calculadora.somar(1, 4));
        System.out.println(calculadora.somar(1.35, 2.65));
        System.out.println(calculadora.somar(lista));
    }
}
