/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

/**
 *
 * @author lucas
 */
public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private char generoAluno;
    private int qiAluno;
    private double alturaAluno;
    private boolean alunoCadastrado;
    
    
    public Aluno(String nomeAluno, int idadeAluno){
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
    }
    
    public void setNome(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    
    public void setIdade(int idadeAluno){
        this.idadeAluno = idadeAluno;
    }
    
    public void setGenero(char generoAluno){
        this.generoAluno = generoAluno;
    }
    
    public void setQi(int qiAluno){
        this.qiAluno = qiAluno;
    }
    
    public void setAltura(double alturaAluno){
        this.alturaAluno = alturaAluno;
    }
    
    public void setCadastrado(boolean alunoCadastrado){
        this.alunoCadastrado = alunoCadastrado;
    }
    
    public String getNome(){
        return nomeAluno;
    }
    
    public int getIdade(){
        return idadeAluno;
    }
    
    public char getGenero(){
        return generoAluno;
    }
    
    public int getQi(){
        return qiAluno;
    }
    
    public double getAltura(){
        return alturaAluno;
    }
    
    public boolean getCadastrado(){
        return alunoCadastrado;
    }
    
    public String ExibeRelatorio(){
        String relatorio =  "\nNome do aluno: " + getNome();
        relatorio += "\nIdade do aluno: " + getIdade();
        relatorio += "\nGênero do aluno: " + getGenero();
        relatorio += "\nQi do aluno: " + getQi();
        relatorio += "\nAltura do aluno: " + getAltura();
        return relatorio;
    }
}
