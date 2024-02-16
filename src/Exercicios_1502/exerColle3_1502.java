package Exercicios_1502;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exerColle3_1502 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 10 números inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            int valor;
            do {
                System.out.print("Valor " + (i + 1) + ": ");
                valor = input.nextInt();
                if (!numeros.add(valor)) {
                    System.out.println("Valor repetido. Digite outro valor.");
                }
            } while (numeros.size() <= i);
        }

        System.out.println("\nListar dados do Set:");
        imprimirSet(numeros);

        input.close();
    }

    public static void imprimirSet(Set<Integer> conjunto) {
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}