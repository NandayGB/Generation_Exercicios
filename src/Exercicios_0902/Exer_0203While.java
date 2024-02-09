//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. 

package Exercicios_0902;

import java.util.Scanner;

public class Exer_0203While {
 

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int menoresQue21 = 0;
            int maioresQue50 = 0;
            int idade;

            System.out.println("Digite uma idade para ver a quantidade de pessoas menores de 21 e maiores de 50  e digite uma idade negativa para parar):");

            idade = input.nextInt();
            while (idade >= 0) {
                if (idade < 21) {
                    menoresQue21++;
                    
                } else if (idade > 50) {
                    maioresQue50++;
                }

                System.out.print("Digite uma idade: ");
                idade = input.nextInt();
            }

            System.out.println("\nTotal de pessoas com menos de 21 anos: " + menoresQue21);
            System.out.println("Total de pessoas com mais de 50 anos: " + maioresQue50);
            System.out.println("numero negativo digitado.");
            input.close();
        }
    }