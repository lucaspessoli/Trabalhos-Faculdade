/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campofutebol;

/**
 *
 * @author lucas
 */
public class Time{
    public String nomeTime;
    public String tecnicoTime;
    public String paisTime;
    public int titulos;
    public Jogador jogadorTime;
    
    public Time(String nomeTime, String tecnicoTime, String paisTime, int titulos, Jogador nomeJogador){
        this.nomeTime = nomeTime;
        this.tecnicoTime = tecnicoTime;
        this.paisTime = paisTime;
        this.titulos = titulos;
        this.jogadorTime = jogadorTime;
    }
    
}
