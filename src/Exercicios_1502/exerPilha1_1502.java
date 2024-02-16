package Exercicios_1502;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exerPilha1_1502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> pilhaLivros = new LinkedList<>();

        int opCode;
        do {
            System.out.println("\n==== Menu ====");
            System.out.println(" 1: Adicionar um novo livro na pilha");
            System.out.println(" 2: Listar todos os livros da pilha");
            System.out.println(" 3: Retirar um livro da pilha");
            System.out.println(" 0: Finalizar o programa");
            System.out.print("\nDigite a opção desejada: ");
            opCode = input.nextInt();
            input.nextLine(); 
            switch (opCode) {
                case 1:
                    System.out.print("\nInsira o nome do livro que deseja adicionar: ");
                    String nome = input.nextLine();
                    pilhaLivros.offer(nome);
                    System.out.println("\nLivro adicionado à pilha!\n");
                    break;
                case 2:
                    System.out.println("\nLivros na pilha:");
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA pilha de livros está vazia!\n");
                    } else {
                        System.out.println("\nO livro " + pilhaLivros.poll() + " foi retirado!\n");
                    }
                    break;
                case 0:
                    System.out.println("\nFinalizando o programa!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Digite novamente.\n");
                    break;
            }

        } while (opCode != 0);

        input.close();
    }
}