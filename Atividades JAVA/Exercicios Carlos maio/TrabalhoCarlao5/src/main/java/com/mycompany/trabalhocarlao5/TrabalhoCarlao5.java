/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhocarlao5;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class TrabalhoCarlao5 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("matheus entrou no sistema");
        lista.add("Matheus fez alteração no sistema");
        lista.add("Matheus saiu");
        
        RegistroConsole registro = new Registravel();
        registro.registrar(lista);
        
    }
}
