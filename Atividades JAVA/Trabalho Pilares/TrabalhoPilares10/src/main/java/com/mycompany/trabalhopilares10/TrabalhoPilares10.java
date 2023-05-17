/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares10;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares10 {

    public static void main(String[] args) {
        
        //10 - Crie uma classe chamada veiculo com atributos privados como marca e ano. Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos 
        //Getters & Setters. Em seguida crie uma classe chamada Carro que herda da classe Veiculo e possui o atributo privado cor. Utilize o encapsulamento para permitir o acesso ao atributo cor
        //Por meio de métodos Getters & Setters
        
        Veiculo v = new Veiculo(2020, "Renault");
        Carro v1 = new Carro(v.getAno(), v.getMarca(), "Rosa");
        
        System.out.println("Ano do seu carro: " + v1.getAno() + ", Marca do seu carro: " + v1.getMarca()  + ", cor do carro:" + v1.getCor());
        
    }
}
