/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoexercicio2;


public class Animal {
    public void EmitirSom(){
        
    }
    
    public void Mover(){
        
    }
}
    class Cachorro extends Animal{
        @Override
        public void EmitirSom(){
            System.out.println("Au au");
        }
        @Override
        public void Mover(){
            System.out.println("Cachorro movido");
        }
    }
    
    class Gato extends Animal{
        @Override
        public void EmitirSom(){
            System.out.println("Miau");
        }
        @Override
        public void Mover(){
            System.out.println("Gato movido");
        }
    }

