package Exercicios_0702;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite salarioBruto");
		float salarioBruto = input.nextFloat();
		System.out.println("digite adicionalNoturno");
		float adicionalNoturno = input.nextFloat();
		System.out.println("digite horasExtras");
		float horasExtras = input.nextFloat();
		System.out.println("digite Descontos");
		float Descontos = input.nextFloat();
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - Descontos;

		System.out.println("Salário Líquido: " + salarioLiquido);
		input.close();
	}
}
