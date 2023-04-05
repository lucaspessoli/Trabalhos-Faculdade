
package com.mycompany.trabalhoarraylistjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TrabalhoArrayListJava {

    public static void main(String[] args) {
//Implemente um programa onde sejam permitidos adicionar vários nomes de
//bandas, excluir um elemento qualquer da lista por seu índice, mostrar novamente
//a lista, fazer uma nova inclusão, e por fim excluir todos os elementos da lista.

//Adaptado de forma que fique mais interativa pro usuário :)
        ArrayList<String> l = new ArrayList<>();
        while (true){
            Scanner scn = new Scanner(System.in);
            System.out.println("\n\nVocê deseja:\n[1] - Adicionar Bandas\n[2] - Excluiir um elemento por indice\n[3] - Mostrar a lista\n[4] - Deletar toda a lista");
            int escolha = scn.nextInt();
            switch(escolha){
                case 1:
                    for(int i =0; i<5; i--){
                        System.out.println("Informe o nome da banda, (Digite pronto para finalizar)");
                        String esc = scn.next();
                        if(esc.equalsIgnoreCase("pronto")){
                            i=25;
                        }else{
                            l.add(esc);
                        }
                    }
                    break;
                case 2:
                    for(int i=0; i<5; i--){
                        System.out.println("Informe o indice da banda a ser excluida (digite -1 para finalizar)");
                        int ind = scn.nextInt();
                        try{
                            if(ind != -1){
                                l.remove(ind);
                            }else{
                                i=25;
                            }
                        }catch(Exception e){
                            System.out.println("Você tentou remover uma banda inexistente!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bandas registradas: " + l);
                    break;
                case 4:
                    if(!l.isEmpty()){
                        l.removeAll(l);
                    }
                    if(l.isEmpty()){
                        System.out.println("Lista de bandas já vazia ou esvaziada!");
                    }
                    break;
                default:
                    System.out.println("Insira um número dentre os que estão na lista!");
                    break;
            }
            
        }
    }
}
