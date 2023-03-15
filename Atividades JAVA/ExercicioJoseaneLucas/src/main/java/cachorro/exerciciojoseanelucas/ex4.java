/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cachorro.exerciciojoseanelucas;

/**
 *
 * @author aluno
 */
public class ex4 {
    public static void Exercicio4(){
        //Array de inteiro contendo os vinte primeiros numeros primos
        int[] primos = new int[20];
        int count =0;
        int num = 2;
        while (count <20){
            boolean ehPrimo = true;
            for (int i=2; i<= Math.sqrt(num);i++){
                if (num % i==0){
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                primos[count] = num;
                count++;
            }
            num++;
        }
    }
    
}
