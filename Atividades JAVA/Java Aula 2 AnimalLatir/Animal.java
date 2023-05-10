/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exericicoredefinicacao;

/**
 *
 * @author aluno
 */
public class Animal {
    public void FazerBarulho(){
        System.out.println("O animal está fazendo barulho");
    }   
}
class Cachorro extends Animal{
    public void FazerBarulho(){
        System.out.println("A cadela está latindo");
    }
}

class Gato extends Animal{
    public void FazerBarulho(){
        System.out.println("O gato está miando");
    }
}

