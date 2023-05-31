/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhocarlao3;

/**
 *
 * @author aluno
 */
public class ArquivoCache implements Armazenavel {
    public void salvar() {
        System.out.println("Sucesso! Arquivos foram salvos.");
    }
    
    public void carregar() {
        System.out.println("Carregando dados do arquivo...");
    }
}
