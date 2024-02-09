package Exercicios_0902;

import java.util.Scanner;

public class exer_0306While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidadeMultiplos = 0;

        do {
            System.out.print("Digite os numeros para serem calculados, para finalizar digite o numero 0");
            numero = input.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                quantidadeMultiplos++;
            }

        } while (numero != 0); //diferente

        double media = 0;
        if (quantidadeMultiplos > 0) {
            media = (double) soma / quantidadeMultiplos;
        }

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

        input.close();
    }
} 	
