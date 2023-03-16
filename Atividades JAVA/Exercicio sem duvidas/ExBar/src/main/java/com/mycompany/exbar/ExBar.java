/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exbar;

/**
 *
 * @author aluno
 */
public class ExBar {

    public static void main(String[] args) {
        Cadastra crj = new Cadastra();
        crj.setNomeB("Marcos");
        crj.setData("05/09");
        crj.setPedido("drink");
        crj.setValor(95.12);
        crj.setMesa(8);
    
        Cadastra crj2 = new Cadastra();
        crj2.setNomeB("Joana");
        crj2.setData("05/02");
        crj2.setPedido("litrao");
        crj2.setValor(25.12);
        crj2.setMesa(7);
        
        Cadastra crj3 = new Cadastra();
        crj3.setNomeB("enzo");
        crj3.setData("10/12");
        crj3.setPedido("whisky");
        crj3.setValor(21.37);
        crj3.setMesa(6);
        
        Cadastra crj4 = new Cadastra();
        crj4.setNomeB("ana julia");
        crj4.setData("10/12");
        crj4.setPedido("vinho");
        crj4.setValor(12.32);
        crj4.setMesa(5);
        
        Cadastra crj5 = new Cadastra();
        crj5.setNomeB("Dante");
        crj5.setData("22/10");
        crj5.setPedido("isbe");
        crj5.setValor(10.88);
        crj5.setMesa(4);
        
        System.out.println("Valor total dos clientes: "+(crj.getValor() + crj2.getValor() + crj3.getValor() + crj4.getValor() + crj5.getValor()));
        
    }
}
