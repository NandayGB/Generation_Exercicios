//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

package Exercicios_0802;

import java.util.Scanner;

public class Exercicio_0101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o número A:");
		int a = input.nextInt();
		System.out.println("digite o numero B:");
		int b = input.nextInt();
		System.out.println("digite o numero C:");
		int c = input.nextInt();
		
		int somaAB = a + b ;

		if ( somaAB > c ) {
			System.out.printf("%d +%d = %d > %d\n", a, b, somaAB, c);
			System.out.printf ("A soma do numero A + b é Maior que C");
		} else if (somaAB < c) {
			System.out.printf("%d +%d = %d < %d\n", a, b, somaAB, c);
			System.out.printf ("A soma do numero A + b é Menor que C");
		}else {
			System.out.printf("%d +%d = %d = %d\n", a, b, somaAB, c);
			System.out.printf ("A soma do numero A + b é Igual que C");
		
input.close();
		}
	}
}