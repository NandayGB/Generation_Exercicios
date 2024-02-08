package Exercicios_0702;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite seu salario");
		float salario = input.nextFloat();
		System.out.println("digite seu abono");
		float abono = input.nextFloat();

		float novoSalario = salario + abono;
		System.out.println("Novo salário: " + novoSalario);
		input.close();
	}
}