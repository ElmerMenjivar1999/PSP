/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author pr0cell
 */
public class ActividadProcesos {
    public static void main(String[] args){
        try {
            ProcessBuilder builder = new ProcessBuilder("pwd");
            Process proceso = builder.start();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
            
            
            int estadoSalida = proceso.waitFor();
            System.out.println("El proceso ha salido con: " + estadoSalida);
        } catch (IOException | InterruptedException e) {
            System.err.println("Se ha producido un error: " + e.getMessage());
        }
    
    }
}
