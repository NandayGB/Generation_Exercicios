package Exercicios_1502;

import java.util.ArrayList;

import java.util.Scanner;

public class exerColle2_1502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        System.out.println("Numeros e suas posições\n");

        System.out.println("List:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println("\n");

        boolean numeroValido = false;
        int numero;
        do {
            System.out.print("Digite o número que você quer localizar (0 a 9): ");
            numero = input.nextInt();
            if (numero >= 0 && numero <= 9) {
                numeroValido = true;
            } else {
                System.out.println("Número inválido. Por favor, digite um número entre 0 e 9.");
            }
        } while (!numeroValido);

        boolean encontrado = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i).equals(numero)) {
                System.out.println("\nO número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        input.close();
    }

       