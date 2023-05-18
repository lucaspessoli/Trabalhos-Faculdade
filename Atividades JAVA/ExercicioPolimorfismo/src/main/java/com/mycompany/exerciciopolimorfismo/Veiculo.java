/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Veiculo {
    ArrayList<String> objetoD = new ArrayList<>();
    
    
    public void Mover(){
        System.out.println("veiculo nao encontrado");
    }
}

class Aviao extends Veiculo{
    @Override
    public void Mover(){
        System.out.println("Aviao moveu");
    }
}

class Carro extends Veiculo{
    @Override
    public void Mover(){
        System.out.println("Carro moveu");
    }
}
