/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares4;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares4 {

    public static void main(String[] args) {
        
        //4 - Crie uma classe chamada Funcionario com atributos privados,  com o nome e salario. Utilize o encapsulamento para permitir o acesso a esse atributos por meios de atributos
        // Getters & Setters
        
        Funcionario f = new Funcionario();
        
        f.setNome("Lucas");
        f.setSalario(25992);
        System.out.println("nome:" + f.getNome() + ", salario: " + f.getSalario());
    }
}
