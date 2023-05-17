/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares8;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares8 {

    public static void main(String[] args) {
        
        //8 - Crie uma classe chamada funcionario com atributos privados com nome e salario. Utilize o encapsulamento para permitir o acesso a esse atributos
        // por meio de métodos Getters & Setters
        
        Funcionario f = new Funcionario();
        
        f.setNome("Renannnnnn");
        f.setSalario(35000);
        
        System.out.println("Seu nome: " + f.getNome() + ", seu salário: " + f.getSalario());
    }
}
