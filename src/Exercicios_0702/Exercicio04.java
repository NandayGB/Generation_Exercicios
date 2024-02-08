package Exercicios_0702;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite n1");
		float n1 = input.nextFloat();
		System.out.println("digite n2");
		float n2 = input.nextFloat();
		System.out.println("digite n3");
		float n3 = input.nextFloat();
		System.out.println("digite n4");
		float n4 = input.nextFloat();
		float calculo = (n1 * n2) - (n3 * n4);

		System.out.println("calculo: " + calculo);
		input.close();
	}
}