/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campofutebol;

/**
 *
 * @author lucas
 */
public class CampoFutebol {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("maicao", "atacante,","corinthias",23,26);
        Jogador jogador2 = new Jogador("zé da bucha", "defensor,","camelo",11,24);
        Jogador jogador3 = new Jogador("marcao", "zagueiro","ornitorrinco",12,23);
        Jogador jogador4 = new Jogador("maria joaquina", "goleiro,","palmeiras",15,22);
        Jogador jogador5 = new Jogador("professora helena", "atacante,","flamengo",7,11);
        
        Time time1 = new Time("corinthias","galo de briga","arabia saudita",23,jogador1);
        Time time2 = new Time("flamengo","mexicano de briga","brasil",23,jogador2);
        
        System.out.println("Próximo jogo será: "+time1.nomeTime+" com o técnico: " + time1.tecnicoTime + " contra: " + time2.nomeTime + " Com o técnico: " + time2.tecnicoTime + ".");
    }
}
