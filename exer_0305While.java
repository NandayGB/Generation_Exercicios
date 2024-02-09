//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. 

package Exercicios_0902;

import java.util.Scanner;

public class exer_0203While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, somaPositivos = 0;

        do {
            System.out.print("Diga um número inteiro: ");
            numero = sc.nextInt();

            if (numero > 0) {
                somaPositivos + = numero;
            }

        } while (numero != 0);

        System.out.println("Soma de todos os números positivos digitados: " + somaPositivos);
        
        sc.close();
    
    }
} 