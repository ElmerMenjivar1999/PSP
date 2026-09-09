package com.mycompany.prueba;

import java.util.Scanner;

public class SumaDiagonalMatriz {
    
    public static void main(String[] args) {
       int numeroUsuario = 0;
       
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce un numero: ");
       numeroUsuario = teclado.nextInt();
       int[][] matriz = new int[numeroUsuario][numeroUsuario];
       
       for(int i = 0; i < numeroUsuario; i++){
           for(int j = 0; j < numeroUsuario; j++){
               int numeroAleatorio = (int) (Math.random() * 10) + 1;
               matriz[i][j] = numeroAleatorio;
           }
       }
       for(int i = 0; i < numeroUsuario; i++){
           for(int j = 0; j < numeroUsuario; j++){
               System.out.print("[" + matriz[i][j] + "]");           
           }
           System.out.println();
       }
       
       System.out.println("Mostrando diagonal de la matriz");
       for(int i = 0; i < numeroUsuario; i++){
           for(int j = 0; j < numeroUsuario; j++){
               if(i == j)
               System.out.print("[" + matriz[i][j] + "]");           
           }
           System.out.println();
       }
       
       System.out.println("Sumando diagonal de la matriz....");
       int suma = 0;
       for(int i = 0; i < numeroUsuario; i++){
           for(int j = 0; j < numeroUsuario; j++){
               if(i == j)
                   suma += matriz[i][j];        
           }
           System.out.println();
       }
    System.out.println("La suma de la diagonal es: " + suma);
    }
}
