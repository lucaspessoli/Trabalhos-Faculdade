/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares6;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares6 {

    public static void main(String[] args) {
        
        //Crie uma classe chamda pessoa com atributos privados, como um nome e idade. U\tilize o encapsulamento para permitir o acesso a esses atributos por meio de getters & setters
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("lucas");
        pessoa.setIdade(19);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
