/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exericicoredefinicacao;

/**
 *
 * @author aluno
 */
public class ExericicoRedefinicacao {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        animal.FazerBarulho();
        cachorro.FazerBarulho();
        gato.FazerBarulho();
    }
}
