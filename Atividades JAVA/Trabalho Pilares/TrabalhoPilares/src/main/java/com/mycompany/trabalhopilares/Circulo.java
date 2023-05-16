/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopilares;

/**
 *
 * @author aluno
 */
public class Circulo extends FormaGeometrica {
        
        double raio;
        double base;

        public Circulo(double raio, int base) {
            this.base = base;
            this.raio = raio;
        }
        
        @Override
        public double CalcularArea(){
            
            double pi = 3.14;
            
            double raioQuadrado = raio * raio;
            
            double areaTotal = (raioQuadrado * pi);
            
            return areaTotal;
        }
}
