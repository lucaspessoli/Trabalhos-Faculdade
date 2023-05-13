/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciooverload;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class Calculadora {
    
    public int somar(int a, int b){
//        System.out.println(a + b);
        return a+b;
    }
    
    public double somar(double a, double b){
//        System.out.println(a + b);
        return a+b;
    }
    
    public int somar(int[] nums){
//        System.out.println(Arrays.stream(numeros).sum());
        return Arrays.stream(nums).sum();
    }
    
}
