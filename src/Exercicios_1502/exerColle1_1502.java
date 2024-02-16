package Exercicios_1502;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class exerColle1_1502{
 
        public static void main(String[] args) {
        	
        	 Scanner input = new Scanner(System.in);
        	 
        	 ArrayList<String> cores = new ArrayList<>();

             System.out.println("Escreva 5 cores:");
             for (int i = 0; i < 5; i++) {
                 System.out.print("Cor " + (i + 1) + ": ");
                 String cor = input.nextLine();
                 cores.add(cor);
             }

       
             System.out.println("\nMostrar todas as cores:");
             for (String cor : cores) {
                 System.out.println(cor);
             }

    
             Collections.sort(cores);

           
             System.out.println("\nMostre as cores em ordem alfabética:");
             for (String cor : cores) {
                 System.out.println(cor);
             }

             input.close();
         }
     }