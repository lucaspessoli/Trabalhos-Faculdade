/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhocarlao2;

/**
 *
 * @author aluno
 */
public class TrabalhoCarlao2 {

    public static void main(String[] args) {
         int[] lista ={743, 213, 7, 512, 3};
                 
         Ordenavel numeros = new BubbleSort();
         numeros.ordenar(lista);
        
        for (int numbers : lista) {
        System.out.println(numbers);  
        }
    }
}