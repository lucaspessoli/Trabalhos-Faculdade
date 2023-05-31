/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhocarlao3;

/**
 *
 * @author aluno
 */
public class TrabalhoCarlao3 {

    public static void main(String[] args) {
        Armazenavel arquivo = new ArquivoCache();
        arquivo.carregar();
        arquivo.salvar();
    }
}
