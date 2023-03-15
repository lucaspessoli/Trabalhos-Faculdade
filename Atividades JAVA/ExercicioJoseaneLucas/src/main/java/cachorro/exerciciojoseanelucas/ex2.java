/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cachorro.exerciciojoseanelucas;

/**
 *
 * @author aluno
 */
public class ex2 {
    public static void Exercicio2(){
                //Numeros Primos 1-1000
        for (int i=2; i<=1000; i++){
            boolean ehPrimo = true;
            for(int j= 2; j <= Math.sqrt(i); j++){
                if (i%j==0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                System.out.println(i + "");
            }
        }
    }
}
