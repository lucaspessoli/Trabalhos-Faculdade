/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ExercicioPolimorfismo {

    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        Carro c = new Carro();
        Aviao a = new Aviao();
        
        v.objetoD.add("Carro");
        v.objetoD.add("Carro");
        v.objetoD.add("Carro");
        v.objetoD.add("Aviao");
        v.objetoD.add("Aviao");
        v.objetoD.add("Aviao");
        
        for(int i =0; i< v.objetoD.size();i++){
            if(v.objetoD.get(i).equalsIgnoreCase("Aviao")){
                a.Mover();
            }else{
                c.Mover();
            }
        }
        
        //ou
        
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro();
        veiculos[1] = new Aviao();
        
        for(Veiculo veiculo : veiculos){
            veiculo.Mover();
        }
        
        
        
    }
}
