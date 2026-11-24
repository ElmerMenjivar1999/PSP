
package com.mycompany.tema3procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pr0cell
 */
public class Actividad2PSP {

    public static void main(String[] args) throws InterruptedException {
        try {
            ProcessBuilder pb = new ProcessBuilder("/usr/bin/ls");
            Process proceso = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
            
            int salida = proceso.waitFor();
            System.out.println("\nCódigo de salida: " + salida);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
