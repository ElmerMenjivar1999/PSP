package com.mycompany.projecttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * La clase Runtime en java permite que una
 * aplicación interactue con la JVM
 * Sirve: 
 *  - Para ejecutar comandos
 *  - Para consultar memoria
 *  - Para registrar tareas de apagado
 */

public class Procesos {
    public static void main(String[] args){
        try {
            
//            Runtime runtime = Runtime.getRuntime(); //Crea la instancia para ejecutar comandos
//            Process proceso = runtime.exec("ping www.google.es");
              //System.out.println(Runtime.getRuntime().exec(new String[]{"/usr/bin/whoami"}).getInputStream());
//            int estadoSalida = proceso.waitFor();//Espera a que el proceso termine
//            System.out.println("Comprobar si es 0: " + estadoSalida);
            
              Process p = Runtime.getRuntime().exec(new String[]{"cat","/etc/passwd"});
              BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
              br.lines().forEach(System.out::println);
        
        } catch (IOException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
        
    }
}
