/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhocarlao2;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class BubbleSort implements Ordenavel{
    
    public void ordenar(int[] lista){
        int n = lista.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
               }
           }
        }
    }
}
