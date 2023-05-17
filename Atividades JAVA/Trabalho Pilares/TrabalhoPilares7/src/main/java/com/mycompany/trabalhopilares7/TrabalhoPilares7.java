/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares7;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares7 {

    public static void main(String[] args) {
        
        //7 - Cria uma classe chamada "Aluno" que herda da classe "Pessoa" e possui um atributo privado "matricula".
        //Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos Getters & Setters.
        
        Pessoa pessoa = new Pessoa("lucas", 19);
        Aluno aluno1 = new Aluno(500, pessoa.getNome(), pessoa.getIdade());
        
        System.out.println("O nome do aluno é: " + aluno1.getNome() + " a sua idade é " + aluno1.getIdade() + " e o número da sua matrícula " + aluno1.getMatricula());
    }
}
