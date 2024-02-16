package Exercicios_1502;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

import java.util.Queue;

public class exerFila1_1502{
 
        public static void main(String[] args) {
        	
        	 Scanner input = new Scanner(System.in);
        	 Queue<String> queue = new LinkedList<>();
        	 
        	while (true) {
        	 System.out.println("\n====Menu====:");
        	 System.out.println(" 1: Novo cliente na fila");
        	 System.out.println(" 2: Lista de todos os clientes na fila");
        	 System.out.println(" 3: Cliente saiu da fila");
        	 System.out.println(" 0: Finalizando o programa?");
        	 System.out.println("\nDigite a opção que deseja :");
        	 
              int opcoes = input.nextInt ();
             
              
              switch (opcao) {
             
             
             case 1:
                 System.out.print("Digite o nome do Cliente que está na fila: ");
                 String nomeCliente = scanner.nextLine();
                 filaClientes.offer(nomeCliente);
                 System.out.println("\nCliente incluido!");
                 break;
             
             case 2:
                 
            	 System.out.println("\nFila:");
                 if (filaClientes.isEmpty()) {
                     System.out.println("A fila ficou vazia!");
                 
                 
                 } else {
                     for (String cliente : filaClientes) {
                         System.out.println(cliente);
                     }
                 }
                 break;
                 
                 
                 
             case 3:
            	 
                 System.out.println("\nFila:");
                 if (filaClientes.isEmpty()) {
                     System.out.println("A fila ficou vazia!");
                 
                 } else {
                     String clienteChamado = filaClientes.poll();
                     System.out.println(clienteChamado + " foi chamado!");
                 }
                 break;
                 
             case 0:
                 System.out.println("\nFinalizando o programa?");
                 break;
             default:
                 System.out.println("\nOpção inválida! Digite novamente.");
         }
     } while (opcoes != 0);
     
     input.close();
 }
}  

   
        
        