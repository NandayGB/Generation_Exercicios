//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares. 

package Exercicios_0902;

import java.util.Scanner;

public class exer_0102While {
	public static void main(String[] args) {
	

	    Scanner input = new Scanner(System.in);

        int numerosPares = 0;  int numerosImpares = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite até 10 numeros e veja a quantidade de pares e impares " + i + " : "
            		+ "");
            int numero = input.nextInt();
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("\nTotal de números pares: " + numerosPares);
        System.out.println("Total de números ímpares: " + numerosImpares);

        input.close();
    }
} 