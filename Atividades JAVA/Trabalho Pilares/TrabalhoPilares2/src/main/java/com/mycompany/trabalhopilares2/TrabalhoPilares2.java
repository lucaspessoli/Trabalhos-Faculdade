/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopilares2;

/**
 *
 * @author aluno
 */
public class TrabalhoPilares2 {

    public static void main(String[] args) {
        
        // 2- Crie uma classe chamada Conta bancária com atributos privados, como saldo e titular. Utilize encapsulamento para permitir o acesso desses atributos por meio
        // de metodos getters & setters
        
        ContaBancaria conta1 = new ContaBancaria();
        
        conta1.setSaldo(2500);
        conta1.setTitular("Renan");
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getTitular());
    }
}
