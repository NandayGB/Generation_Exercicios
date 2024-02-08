//Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
package Exercicios_0802;

import java.util.Scanner;

public class Exercicio_0207 {
	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);

	        System.out.print("Digite o 1º número: ");
	        float numero1 = input.nextFloat();

	        System.out.print("Digite o 2º número: ");
	        float numero2 = input.nextFloat();

	        System.out.print("Operação: ");
	        int operacao = input.nextInt();

	        float resultado = 0.00f;

	        switch (operacao) {
	            case 1:
	                resultado = numero1 + numero2;
	                System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, resultado);
	                break;
	            case 2:
	                resultado = numero1 - numero2;
	                System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, resultado);
	                break;
	            case 3:
	                resultado = numero1 * numero2;
	                System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, resultado);
	                break;
	            case 4:
	            	resultado = numero1 / numero2;
	                System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, resultado);
	                break;	                
	            default:
	                System.out.println("Operação inválida!");	                
	        }

	        input.close();
	    }
	}