/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campofutebol;

/**
 *
 * @author lucas
 */
public class Jogador {
    private String nomeJogador;
    private String posicaoJogador;
    private String time;
    private int numeroJogador;
    private int idadeJogador;
    
    public void Substitucao(){
        System.out.println("Jogador: " + nomeJogador + " " + numeroJogador + " Substituido.");
    }
    public void Falta(){
        System.out.println("Jogador: " + nomeJogador + "recebeu falta.");
    }
    public void Reserva(){
        if (idadeJogador >=30){
            System.out.println("Jogador é reserva:");
        }else{
            System.out.println("Jogador poderá jogar");
        }
    }
    
    public Jogador(String nomeJogador, String posicaoJogador, String time, int numeroJogador, int idadeJogador){
        this.nomeJogador = nomeJogador;
        this.posicaoJogador = posicaoJogador;
        this.time = time;
        this.numeroJogador = numeroJogador;
        this.idadeJogador = idadeJogador;
    }
    
}
