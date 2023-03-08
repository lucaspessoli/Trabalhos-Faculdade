
package com.mycompany.aula03031;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Aula03031 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("insira seu primeiro numero: ");
        int valor1 = scn.nextInt();
        System.out.println("insira seu segundo numero: ");
        int valor2 = scn.nextInt();
        System.out.println("Até onde seu for irá ir: ");
        int ate = scn.nextInt();
      System.out.printf("O Resultado foi: " + "%.3f", (valor1+valor2));
        System.out.printf("Resultados:\n");
        System.out.printf("%d + %d = %3d\n", valor1, valor2, (valor1+valor2));
        System.out.printf("%d - %d = %3d\n", valor1, valor2, (valor1-valor2));
        System.out.printf("%d * %d = %3d\n", valor1, valor2, (valor1*valor2));
        System.out.printf("%d / %d = %3d(divisao inteira)\n", valor1, valor2, (valor1/valor2));
        System.out.printf("%d / %d = %6.2f(divisao exata)\n", valor1, valor2, ((double)valor1/valor2));
        for (valor1=0; valor1<ate; valor1++){
            System.out.printf("Informe o %2dº, valor:",(valor1+1));
            System.out.println(valor1 + 1);
        }
        
        
        
        
        //Ex2
//        System.out.println("Informe o raio:");
//        double raio = scn.nextDouble();
//        double resultado = (raio*raio*22/7);
//        System.out.printf("o Resultado é: " + "%.4f", resultado);
    }
}
