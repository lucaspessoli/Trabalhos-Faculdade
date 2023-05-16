/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares5;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares5 {

    public static void main(String[] args) {
        
        //5 - Crie uma classe chamada gerente que herda da classe Funcionario e possui atributo privado bônus. Utilize o encapsulamento para permitir o acesso ao atributo bonus por meio
        // dos métodos Getters & Setters
        
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        
        g.setBonus(255);
        System.out.println("O seu bônus é: " + g.getBonus());
    }
}
