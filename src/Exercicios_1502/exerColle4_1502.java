package Exercicios_1502;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exerColle4_1502 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     

            Set<Integer> numeros = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                numeros.add(i);
            }

            int numero;
            boolean numeroValido = false;
            do {
                System.out.println("Digite o número que você deseja encontrar: ");
                numero = input.nextInt();
                if (numeros.contains(numero)) {
                    numeroValido = true;
                } else {
                    System.out.println("O número não foi encontrado :");
                }
            } while (!numeroValido);

            if (numero < 10) {
                System.out.println("\nNúmero 0" + numero + " Encontrado!");
            } else {
                System.out.println("\nNúmero " + numero + " Encontrado!");
            }

            input.close();
        }
    }