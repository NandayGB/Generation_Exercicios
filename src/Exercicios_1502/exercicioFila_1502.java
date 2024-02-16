package Exercicios_1502;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

import java.util.Queue;
public class exercicioFila_1502{
 
        

 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        
        int opcao;
        do {
            queue.add("\n==== Menu ====");
            queue.add(" 1: Novo cliente na fila");
            queue.add(" 2: Lista de todos os clientes na fila");
            queue.add(" 3: Cliente saiu da fila");
            queue.add(" 0: Finalizar o programa");
            queue.add("\nDigite a opção desejada: ");
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    input.nextLine(); // Limpar o buffer do scanner
                    queue.add("Digite o nome do cliente que está na fila: ");
                    String nomeCliente = input.nextLine();
                    queue.offer(nomeCliente);
                    queue.add("\nCliente incluído na fila!");
                    break;
                case 2:
                    queue.add("\nFila:");
                    if (queue.isEmpty()) {
                        queue.add("A fila está vazia!");
                    } else {
                        for (String cliente : queue) {
                            queue.add(cliente);
                        }
                    }
                    break;
                case 3:
                    queue.add("\nFila:");
                    if (queue.isEmpty()) {
                        queue.add("A fila está vazia!");
                    } else {
                        String clienteChamado = queue.poll();
                        queue.add(clienteChamado + " foi chamado!");
                    }
                    break;
                case 0:
                    queue.add("\nFinalizando o programa.");
                    break;
                default:
                    queue.add("\nOpção inválida! Digite novamente.");
                    break;
            }
        } while (opcao != 0);
        
        input.close();
    }
}