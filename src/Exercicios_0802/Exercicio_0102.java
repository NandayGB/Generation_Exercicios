package Exercicios_0802;

import java.util.Scanner;

public class Exercicio_0102 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("digite um numero:");
	int number = input.nextInt();
	String parImpar = (number % 2 == 0)? "par" : "impar";
	System.out.println("digite o numero:");
	if (number >= 0) {
        System.out.printf("%d é %s e positivo!%n", number, parImpar);
    } else {
        System.out.printf("%d é %s e negativo!%n", number, parImpar);
    }
    input.close();
}
}
	
	
	
	