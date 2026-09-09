/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author Usuario
 */
public class SumaNumeros {
    public static void main(String args[]){
        System.out.println("Hello World!");
        int resultado = suma_numeros(3,5);
        System.out.println(resultado);
    }
    
    static int suma_numeros(int a, int b){
        int c = a + b;
        return c;
    }
}
