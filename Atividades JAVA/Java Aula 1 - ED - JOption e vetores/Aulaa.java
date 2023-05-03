/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaa;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author aluno
 */
public class Aulaa {

    public static void main(String[] args) {
        String[] vetorNomes = new String[5];
        
//        vetorNomes[0] = "Joao";
//        vetorNomes[1] = "Lucas";
        
        for(int i = 0;i<vetorNomes.length;i++){
            String nome = JOptionPane.showInputDialog("Informe seu nome:");
            vetorNomes[i] = nome;
//            System.out.println(vetorNomes[i]);
        }
        
        String msg= "Nomes inseridos no vetor: \n";
        for(int i = 0; i<vetorNomes.length;i++){
            msg += "Posição na fila: [" + i + "] nome: " + vetorNomes[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg);

    }
}
