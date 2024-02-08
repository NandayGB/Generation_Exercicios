package Exercicios_0802;

import java.util.Scanner;

public class Exercicio_0205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Código do Produto: ");
        int codigoProduto = input.nextInt();
        
        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();
        
        double valorTotal = 0;
   
        String nomeProduto = "";
        
        switch (codigoProduto) {
            case 1:
                valorTotal = quantidade * 10.00;
                nomeProduto = "Cachorro Quente";
                break;
            case 2:
                valorTotal = quantidade * 15.00;
                nomeProduto = "X-Salada";
                break;
            case 3:
                valorTotal = quantidade * 18.00;
                nomeProduto = "X-Bacon";
                break;
            case 4:
                valorTotal = quantidade * 12.00;
                nomeProduto = "Bauru";
                break;
            case 5:
                valorTotal = quantidade * 8.00;
                nomeProduto = "Refrigerante";
                break;
            case 6:
                valorTotal = quantidade * 13.00;
                nomeProduto = "Suco de laranja";
                break;
            default:
                System.out.println("Código de Produto Inválido!");
                
        }
        
        System.out.println("\nProduto: " + nomeProduto);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        
        input.close();
    }
}
