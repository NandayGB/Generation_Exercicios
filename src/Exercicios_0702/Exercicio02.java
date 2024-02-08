package Exercicios_0702;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite Nota1");
		float Nota1 = input.nextFloat();
		System.out.println("digite Nota2");
		float Nota2 = input.nextFloat();
		System.out.println("digite Nota3");
		float Nota3 = input.nextFloat();
		System.out.println("digite Nota2");
		float Nota4 = input.nextFloat();
		float calcularMedia = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

		System.out.println("calcularNota: " + calcularMedia);
		input.close();
	}
}