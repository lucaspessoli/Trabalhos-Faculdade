/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class Mamifero extends Animal {
    private String alimento;
    
    public Mamifero (String nome, int comprimento, int patas, String cor, String ambiente, float velocidade, String alimento){
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }
    
    public String Alimento(){
        return "O alimento do animal é: " + this.alimento;
    }
    
        public void Dados(){
        System.out.println("nome do animal" + getNome());
        System.out.println("comprimento do animal" + getComprimento());
        System.out.println("patas do animal" + getPatas());
        System.out.println("Ambiente do animal" + getAmbiente());
        System.out.println("velocidade do animal" + getVelocidade());    
        System.out.println( Alimento());
    }
}
