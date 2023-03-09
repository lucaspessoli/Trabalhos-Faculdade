/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv01;

/**
 *
 * @author lucas
 */
public class Cachorro {
    String nome;
    String corDeOlhos;
    String sobrenome;
    int idade;
    double peso;
    
    
    public void Latir(){
        if (idade > 10){
            System.out.println("RWOOF, RWOOF");
        }
        if (idade > 6){
            System.out.println("Au au au");
        }else{
            System.out.println("Yip yip!");
        }
    }
}
