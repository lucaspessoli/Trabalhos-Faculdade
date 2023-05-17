/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares9;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares9 {

    public static void main(String[] args) {
        
        //9 - Cria uma classe chamada Programador que herda da classe Funcionario e possui um atributo privado linguagem. Utilize encapsulamento para permitir o acesso ao atributo
        // linguagem por meio de métodos Getter e Setters.
        
        Funcionario funcionario = new Funcionario("Lucas", 49000);
        Programador programa = new Programador("React JS", funcionario.getNome(), funcionario.getSalario());
        
        System.out.println("O nome do funcionário é: " + programa.getNome() + ", seu salário é: " + programa.getSalario() + " e utiliza a linguagem: " + programa.getLinguagem());
    }
}
