/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhocarlao5;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class RegistroConsole implements Registravel {
    
    public void registrar(ArrayList<String> logs){
        for(String item : logs){
            System.out.println(item);
        }
    }
}
