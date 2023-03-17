/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escola;

/**
 *
 * @author lucas
 */
public class Escola {

    public static void main(String[] args) {
        Aluno al1 = new Aluno("Matheus", 15);
        al1.setGenero('M');
        al1.setQi(102);
        al1.setAltura(1.32);
        al1.setCadastrado(true);
        
        Aluno al2 = new Aluno("Roger", 15);
        al2.setGenero('M');
        al2.setQi(69);
        al2.setAltura(1.88);
        al2.setCadastrado(false);
        
        Aluno al3 = new Aluno("Joana", 15);
        al3.setGenero('F');
        al3.setQi(185);
        al3.setAltura(1.65);
        al3.setCadastrado(true);
        
        
        if (al1.getCadastrado()){
            Turma turma1 = new Turma("AOC1", 15, "Matematica", al1);
            System.out.println("\nAluno cadastrado! Imprimindo relatório do aluno: \n" + al1.ExibeRelatorio());
        }
        else{
            System.out.println("\nSeguinte aluno: " + al1.getNome() + " não foi cadastrado!");
        }
        if (al2.getCadastrado()){
            Turma turma2 = new Turma("AOC2", 13, "portugues", al2);
            System.out.println("\nAluno cadastrado! Imprimindo relatório do aluno: \n" + al1.ExibeRelatorio());
        }
        else{
            System.out.println("\nSeguinte aluno: " + al2.getNome() + " Não foi cadastrado!");
        }
        if (al3.getCadastrado()){
            Turma turma2 = new Turma("AOC3", 23, "portugues", al3);
            System.out.println("\nAluno cadastrado! Imprimindo relatório do aluno: \n" + al1.ExibeRelatorio());
        }
        else{
            System.out.println("\nSeguinte aluno: " + al3.getNome() + " Não foi cadastrado!");
        }
    }
}
